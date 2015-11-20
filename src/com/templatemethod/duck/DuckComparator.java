package com.templatemethod.duck;

import java.util.*;

public class DuckComparator implements Comparator<Duck>{
  //@override
  public int compare(Duck d1,Duck d2) {
    
   
  
  if (d1. getDuckWeight() < d2. getDuckWeight()) {
   return -1;
  } else if (d1. getDuckWeight() == d2. getDuckWeight()) {
   return 0;
  } else { //duck1.Duck() > duck2.Duck()
   return 1;
  }
 }

}