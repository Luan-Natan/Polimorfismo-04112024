abstract class Animal {
    abstract void fazerSom();
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O gato faz: Miau!");
    }
}