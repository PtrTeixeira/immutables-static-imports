package com.ptrteixeira.immutables;

import java.util.Objects;
import org.immutables.encode.Encoding;

@Encoding
public class BoxEncoding<T> {
  @Encoding.Impl
  private Box<T> field;

  @Encoding.Expose
  public Box<T> getBox() {
    return field;
  }

  @Encoding.Expose
  public T getValue() {
    return field.getValue();
  }

  @Encoding.Of
  static <T> Box<T> init(Box<? extends T> other) {
    return Box.box(other.getValue());
  }

  @Encoding.Builder
  static class Builder<T> {
    private Box<T> field;

    @Encoding.Init
    @Encoding.Copy
    @Encoding.Naming(standard = Encoding.StandardNaming.INIT)
    public void set(Box<T> value) {
      this.field = Objects.requireNonNull(value);
    }
//
//    @Encoding.Init
//    @Encoding.Naming(standard = Encoding.StandardNaming.PUT)
//    public void put(T value) {
//      this.field = Box.box(value);
//    }

//    @Encoding.Init
//    @Encoding.Naming(standard = Encoding.StandardNaming.INIT)
//    public void list(List<T> values) {
//      this.field = Box.headOfList(values, null);
//    }

    @Encoding.Build
    Box<T> build() {
      return field;
    }
  }
}
