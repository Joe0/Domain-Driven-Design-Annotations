package com.joepritzel.ddd;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Creates a list of all classes in the domain that this object interacts with.
 * @author Joe Pritzel
 *
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Interactions {
	public Class<?>[] interactsWith();
}
