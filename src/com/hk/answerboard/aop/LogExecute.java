package com.hk.answerboard.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExecute {
	/*
	 * getArgs(): 메서드의 아규먼트를 반환
	 * getTarget(): 대상 객체를 반환
	 * getSignature(): 어드바이즈되는 메서드의 설명
	 * getThis(): 프록시 객체를 반환
	 */
	public void before(JoinPoint join) {
		Logger log=LoggerFactory.getLogger(join.getTarget()+"");
		log.debug("시작");
		log.info("---------시작---------");
	}
	
	public void afterReturning(JoinPoint join) {
		Logger log=LoggerFactory.getLogger(join.getTarget()+"");
		log.debug("끝");
		log.info("---------끝---------");
	}
	public void daoError(JoinPoint join) {
		Logger log=LoggerFactory.getLogger(join.getTarget()+""+join.getKind());
		log.debug("에러"+join.getArgs());
		log.debug("에러"+join.toString());
	}
}
