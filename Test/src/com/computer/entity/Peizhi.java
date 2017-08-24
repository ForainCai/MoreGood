package com.computer.entity;

public class Peizhi {
	String cpu;
	String zb;
	String memory;
	String mouse;
	String keyborad;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getZb() {
		return zb;
	}
	public void setZb(String zb) {
		this.zb = zb;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public String getKeyborad() {
		return keyborad;
	}
	public void setKeyborad(String keyborad) {
		this.keyborad = keyborad;
	}
	@Override
	public String toString() {
		return "Peizhi [cpu=" + cpu + ", zb=" + zb + ", memory=" + memory + ", mouse=" + mouse + ", keyborad="
				+ keyborad + "]";
	}
}
