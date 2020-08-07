package lib;

import java.util.*;

public class ArrayValue implements Value {
	public List<Value> elements;
	public ArrayValue() {
		this.elements = new ArrayList<>();
	}
	public ArrayValue(List<Value> args) {
		this.elements = new ArrayList<>();
		for(Value arg : args){ this.elements.add(arg); }
	}
	public ArrayValue(ArrayValue array) {
		this(array.elements); //MAY NOT WORK!
	}
	public Value get(int index) {
		return this.elements.get(index);
	} public void set(int index, Value value) {
		this.elements.add(index, value);
	}
	@Override
	public String asString() {
		return this.elements.toString();
	}
	@Override
	public int asInteger() {
		return 1;
	}
	@Override
	public double asDouble() {
		return 1.0;
	}
	@Override
	public boolean asBoolean() {
		return true;
	}
	public String toString() {
		return this.asString();
	}
}