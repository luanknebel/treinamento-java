package br.com.treinamento.jakarta.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CollectionUtil {

    public static <T> List<T> getNotNull(List<T> collection) {
        return Objects.isNull(collection) ? Collections.emptyList() : collection;
    }

    public static <T> Collection<T> getNotNull(Collection<T> collection) {
        return Objects.isNull(collection) ? Collections.emptyList() : collection;
    }

    public static <T> Collection<T> getNotNull(T[] objectArray) {
        return Objects.isNull(objectArray) ? Collections.emptyList() : Arrays.asList(objectArray);
    }

    public static <T> List<T> getNotNullToList(T[] objectArray) {
        return new ArrayList<T>(getNotNull(objectArray));
    }

    public static boolean isNotNullOrEmpty(Collection<?> collection) {
        return !isNullOrEmpty(collection);
    }

    public static boolean isNullOrEmpty(Collection<?> collection) {
        return Objects.isNull(collection) || collection.isEmpty();
    }

    public static <T> boolean isNotNullOrEmpty(T[] objectArray) {
        return !isNullOrEmpty(objectArray);
    }

    public static <T> boolean isNullOrEmpty(T[] objectArray) {
        return Objects.isNull(objectArray) || objectArray.length == 0;
    }

}
