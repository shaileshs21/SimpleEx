package com.simple.instant;

import java.time.Instant;

public class app {

  public static void main(String[] args) {

    Instant instant = Instant.now();
    System.out.println( instant );
    Instant instant2 = instant.plusSeconds( 3600 );
    System.out.println( instant.compareTo( instant2 ) );
  }

}

// instant = instant.plusSeconds(144000);
