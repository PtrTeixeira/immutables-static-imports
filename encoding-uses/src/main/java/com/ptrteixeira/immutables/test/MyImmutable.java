package com.ptrteixeira.immutables.test;

import com.ptrteixeira.immutables.Box;
import com.ptrteixeira.immutables.BoxEncodingEnabled;
import org.immutables.value.Value;

@Value.Immutable
@BoxEncodingEnabled
public interface MyImmutable {
  Box<String> getMyString();
}
