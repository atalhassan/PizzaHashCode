// @File ProblemSet.java
// @Author Abdullah Alhassan
// @Date 17 Feb 2018
// Description:
//  This is a class that will represeent a given prblem by representing the
//  parameters of a problem in an ArrayList

import java.util.ArrayList;

public class ProblemSet {
  public ArrayList<Integer> parameters = new ArrayList<Integer>();
  public ArrayList<ArrayList<Character>> pizza = new ArrayList<ArrayList<Character>>();

  public ProblemSet( ArrayList<Integer> parameters, ArrayList<ArrayList<Character>> pizza) {
    this.parameters = parameters;
    this.pizza = pizza;
  }
}
