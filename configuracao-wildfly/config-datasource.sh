#!/bin/bash
set -e
set -o pipefail
. ./environment.conf

echo -e "\nConfiguring datasource PostgresDS..."

$JBOSS_HOME/bin/jboss-cli.sh <<EOF
embed-server --std-out=echo --server-config=standalone.xml
batch
data-source add \
--name=PostgresDS \
--jndi-name=java:/jdbc/PostgresDS \
--driver-name=postgresql \
--driver-class=org.postgresql.Driver \
--connection-url=jdbc:postgresql://localhost:5432/treinamento \
--user-name=postgresql \
--password=postgresql \
--min-pool-size=5 \
--max-pool-size=10 \
--jta=true \
--use-ccm=true \
--enabled=true \
--query-timeout=100 \
--idle-timeout-minutes=1 \
--statistics-enabled=true \
--validate-on-match=true \
--background-validation=false \
--check-valid-connection-sql="SELECT 1" \
--transaction-isolation=TRANSACTION_READ_COMMITTED \
--valid-connection-checker-class-name=org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLValidConnectionChecker \
--exception-sorter-class-name=org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLExceptionSorter

run-batch
stop-embedded-server
EOF

echo -e "\nApplying custom configs to datasource and transactions..."

$JBOSS_HOME/bin/jboss-cli.sh <<'EOF'
embed-server --std-out=echo --server-config=standalone.xml
batch

/subsystem=transactions:write-attribute(name=default-timeout,value=120)

run-batch
stop-embedded-server
EOF

