// Animal class เป็นคลาสพื้นฐานที่กำหนดคุณสมบัติทั่วไปและพฤติกรรมของสัตว์ทั้งหมด
class Animal {
  private String name;
  private String description;

  //ตัวสร้างเพื่อเริ่มต้นชื่อและคำอธิบายของสัตว์
  public Animal(String name, String description) {
    this.name = name;
    this.description = description;
  }

  //Method Getter สำหรับ property ของชื่อ
  public String getName() {
    return name;
  }

  //Method Getter สำหรับproperty ของคำอธิบาย
  public String getDescription() {
    return description;
  }
}

//class Mammal สืบทอดมาจาก class สัตว์และเป็นตัวแทนของ Mammal
class Mammal extends Animal {
  public Mammal(String name, String description) {
    super(name, description);
  }
}

//class Reptile สืบทอดมาจาก class สัตว์และเป็นตัวแทนของ Reptile
class Snake extends Animal {
  public Snake(String name, String description) {
    super(name, description);
  }
}

//class Bird สืบทอดมาจาก class สัตว์และเป็นตัวแทนของ Bird
class Bird extends Animal {
  public Bird(String name, String description) {
    super(name, description);
  }
}

//class Giraffe สืบทอดมาจาก class สัตว์และเป็นตัวแทนของ Giraffe
class Giraffe extends Animal {
public Giraffe(String name, String description) {
  super(name, description);
}
}

//class Eagle สืบทอดมาจาก class สัตว์และเป็นตัวแทนของ Eagle
class Eagle extends Animal {
public Eagle(String name, String description) {
super(name, description);
}
}

//class Crocodile สืบทอดมาจาก class สัตว์และเป็นตัวแทนของ Crocodile
class Crocodile extends Animal {
public Crocodile(String name, String description) {
  super(name, description);
}
}


