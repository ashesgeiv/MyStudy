/**
 * Main
 */

class Element {
  char data = 0;
  static Element pointer;
}

class LinkList1 {

  Element head;
  Element pElement;

  LinkList1() {

  }

  Element makeNewElement() {
    return new Element();
  }

  void put(char data) {
    Element p = makeNewElement();
    p.data = data;
    pElement.pointer = p;
    pElement = p;
    System.out.println("-1");
  }

  void put(char data, int num) {

    Element p = chaXun(num);
    Element pNew = makeNewElement();
    pNew.data = data;
    pNew.pointer = p.pointer;
    p.pointer = pNew;
  }

  void delete(int num) {
    Element p = chaXun(num - 1);
    Element pNew = p.pointer;
    p.pointer = pNew.pointer;
  }

  Element chaXun(int num) {

    Element p = head.pointer;
    for (int i = 0; i != num || p.pointer != null; i++) {
      p = p.pointer;
      System.out.println(i);
    }
    return p;
  }

  void tongJi() {
    int i = 0;
    Element p = head.pointer;
    if (p == null) {
      System.out.println("-1");
    }

    for (; p.pointer != null; i++) {
      p = p.pointer;
    }
    System.out.println(i);
  }

  void show() {

    Element p = head.pointer;
    while (p.data != 0) {
      System.out.println(p.data);
      p = p.pointer;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    LinkList1 list1 = new LinkList1();
    list1.put('x');
    list1.show();
  }
}