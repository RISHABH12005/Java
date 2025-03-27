/*
Make your first inheritance based design
There were Pandavs and Kauravs.
Arjun and Bheem were Pandavs.
Duryodhan was a Kaurav.
Pandavs were characterized by their skills of fighting(fight( )),obedience(obey( )),and kindness(kind( )).
Though Bheem was little less kind but equally obedient as Arjun.
Kauravs were notorious for disobeying and cruelty. But Kauravs were fighters.
Kauravs were 100 in numbers, but one of them ‘Vikarn’ was a noble man- a good fighter, kind and obedient.
If you dive a little more in the history, you will come to know that Pandavs and Kauravs were actually Bharatvanshi.
And all bharatvanshis had been fighters.
You are required to create a design first on paper and then write implementation on your machine.
Make abstract classes and concrete classes.
Decide which methods should be made abstract or non-abstract.
*/
abstract class Bharatvanshi {
    void fight() {
        System.out.println(getClass().getSimpleName() + " is fighting!");
    }
    abstract void obey();
    abstract void kind();
}
abstract class Pandav extends Bharatvanshi {
    @Override
    void obey() {
        System.out.println(getClass().getSimpleName() + " is obedient.");
    }
    @Override
    void kind() {
        System.out.println(getClass().getSimpleName() + " is kind.");}
}
class Arjun extends Pandav {}
class Bheem extends Pandav {
    @Override
    void kind() {
        System.out.println(getClass().getSimpleName() + " is less kind.");}
}
abstract class Kaurav extends Bharatvanshi {
    @Override
    void obey() {
        System.out.println(getClass().getSimpleName() + " is disobedient.");
    }
    @Override
    void kind() {
        System.out.println(getClass().getSimpleName() + " is cruel.");}
}
class Duryodhan extends Kaurav {}
class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println(getClass().getSimpleName() + " is obedient.");
    }
    @Override
    void kind() {
        System.out.println(getClass().getSimpleName() + " is kind.");}
}
class Mahabharat {
    public static void main(String args[]) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();
        System.out.println("Pandavs");
        arjun.fight();
        arjun.obey();
        arjun.kind();
        bheem.fight();
        bheem.obey();
        bheem.kind();
        System.out.println("\n Kauravs");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();}
}