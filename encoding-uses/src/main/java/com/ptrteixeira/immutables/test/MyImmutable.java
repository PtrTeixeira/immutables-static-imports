package com.ptrteixeira.immutables.test;

import com.ptrteixeira.immutables.BoxEncodingEnabled;
import com.ptrteixeira.immutables.box.Box;
import org.immutables.value.Value;

@Value.Immutable
@BoxEncodingEnabled
public interface MyImmutable {
  Box<String> getMyString();
}
