package jour02;

// Classe abstraite Animal
abstract class Animal {
    abstract void faireDuBruit();
}

// Classe Chat qui étend Animal
class Chat extends Animal {
    @Override
    void faireDuBruit() {
        System.out.println("Le chat miaule.");
    }
}

// Classe Chien qui étend Animal
class Chien extends Animal {
    @Override
    void faireDuBruit() {
        System.out.println("Le chien aboie.");
    }
}

// Classe Oiseau qui étend Animal
class Oiseau extends Animal {
    @Override
    void faireDuBruit() {
        System.out.println("L'oiseau chante.");
    }
}

public class TestAnimaux {
    public static void main(String[] args) {
        Animal chat = new Chat();
        Animal chien = new Chien();
        Animal oiseau = new Oiseau();

        chat.faireDuBruit();   // Affiche "Le chat miaule."
        chien.faireDuBruit();  // Affiche "Le chien aboie."
        oiseau.faireDuBruit(); // Affiche "L'oiseau chante."
    }
}

