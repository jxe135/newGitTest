//
//public class test1{
//
///* This goes into the interactions pane */
//Name n1 = new Name("DFdf", "fe");
//Name n2= new Name("rgjkrn", "lke");
//Name n3 = new Name("dfkje", "ert");
//Name[] names = {n1, n2, n3};
//java.util.Arrays.sort(names, Name.compareByLastName());
//// Shortcut
//java.util.Arrays.sort(names,Name::compareLastNames);
//
///* This goes into the program */
//public static Comparator<Name> compareByLastName() {
//  return new Comparator<Name>(){
//    public int compare(Name n1, Name n2) {
//      return n1.getLastName().compareTo(n2.getLastName());
//    }
//  }
//}
//
//// shortcut using lambda notation
//public static Comparator<Name> compareByLastName() {
//  return (Name n1, Name n2) -> {
//    return n1.getLastName().compareTo(n2.getLastName());
//  }
//}
//
//// Even shorter
//public static Comparator<Name> compareByLastName() {
//  return (Name n1, Name n2) -> n1.getLastName().compareTo(n2.getLastName());
//}
//
//// Even shorter
//public static Comparator<Name> compareByLastName() {
//  return (n1, n2) -> n1.getLastName().compareTo(n2.getLastName());
//}
///* This lambda shortcut is excluive to Java 8 */
//
//public static int compareLastNames(Name n1, Name n2)
//{
//  return n1.getLastName().compareTo(n2.getLastName());
//}