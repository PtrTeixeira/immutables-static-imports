package com.ptrteixeira.immutables;

import java.util.List;

public class Box<T> {
  private final T value;

  private Box(T value) {
    this.value = value;
  }

  public static <T> Box<T> box(T t) {
    return new Box<>(t);
  }

  public static <T> Box<T> headOfList(List<T> xs, T defaultValue) {
    if (xs.isEmpty()) {
      return new Box<>(defaultValue);
    } else {
      return new Box<>(xs.getFirst());
    }
  }

  public T getValue() {
    return value;
  }
}
