package com.cm.entity;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable{
   private Integer id;
   
   private String name;
   
   private String pass;
   
   private String sign;
   
   private String face;
   
   private Integer blogcount;
   
   private Integer fanscount;
   
   private Date uptime;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

public String getSign() {
	return sign;
}

public void setSign(String sign) {
	this.sign = sign;
}

public String getFace() {
	return face;
}

public void setFace(String face) {
	this.face = face;
}

public Integer getBlogcount() {
	return blogcount;
}

public void setBlogcount(Integer blogcount) {
	this.blogcount = blogcount;
}

public Integer getFanscount() {
	return fanscount;
}

public void setFanscount(Integer fanscount) {
	this.fanscount = fanscount;
}

public Date getUptime() {
	return uptime;
}

public void setUptime(Date uptime) {
	this.uptime = uptime;
}
}
