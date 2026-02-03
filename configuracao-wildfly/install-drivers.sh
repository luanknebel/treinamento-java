#!/bin/bash
set -e
set -o pipefail
. ./environment.conf

echo -e "\nCreating PostgreSQL Driver module..."
mkdir -p $JBOSS_HOME/modules/org/postgresql/main
cp ./postgresql-42.7.7.jar $JBOSS_HOME/modules/org/postgresql/main 

cat > $JBOSS_HOME/modules/org/postgresql/main/module.xml <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<module name="org.postgresql" xmlns="urn:jboss:module:1.9">
    <resources>
        <resource-root path="postgresql-42.7.7.jar"/>
    </resources>
    <dependencies>
        <module name="javax.api"/>
        <module name="jakarta.transaction.api"/>
    </dependencies>
</module>
EOF

echo -e "\nConfigure PostgreSQL subsystem..."
$JBOSS_HOME/bin/jboss-cli.sh <<EOF
embed-server --std-out=echo --server-config=standalone.xml
batch
/subsystem=datasources/jdbc-driver=postgresql:add(driver-name="postgresql", driver-module-name="org.postgresql", driver-class-name="org.postgresql.Driver")
run-batch
stop-embedded-server
EOF


