package com.scm.modal;

import java.io.Serializable;

public class Pagination implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4510270091370714249L;

	private int offset;

	private int size;

	public Pagination() {

	}

	public Pagination(int offset, int size) {
		this.offset = offset;
		this.size = size;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
