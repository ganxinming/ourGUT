package com.ourgut.design.pattern.common;

/**
 * @author ganxinming
 * @createDate 2022/1/10
 * @description
 */
public class JavaICourseFactory implements ICourseFactory{
	@Override
	public ICourse create() {
		return new JavaCourse();
	}
}
