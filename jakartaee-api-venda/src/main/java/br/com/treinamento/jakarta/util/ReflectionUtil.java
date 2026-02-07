package br.com.treinamento.jakarta.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 
 * @author Luan Knebel
 * @date 24/05/2024
 */
@SuppressWarnings({"unchecked"})
public class ReflectionUtil {

	public static <T> Class<T> getSuperClassParameter(Class<?> clazz, Class<?> clazzType) {
		return getSuperClassParameter(clazz, clazzType, 0);
	}

	public synchronized static <T> Class<T> getSuperClassParameter(Class<?> clazz, Class<?> clazzType, int index) {
		ParameterizedType parametrizedType = getParametrizedType(clazz, clazzType);
		return (Class<T>) parametrizedType.getActualTypeArguments()[index];
	}

	private static ParameterizedType getParametrizedType(Class<?> clazz, Class<?> clazzType) {
		if (clazz.getSuperclass().equals(clazzType)) {
			return (ParameterizedType) clazz.getGenericSuperclass();
		} else {
			return getParametrizedType(clazz.getSuperclass(), clazzType);
		}
	}

}
