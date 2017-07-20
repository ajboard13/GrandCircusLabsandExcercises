package Labs.Lab12;


class PlayerFactory {

    static Player getInstance(String choice) {
        if (choice.equalsIgnoreCase("b")) {
            return new Brock("Brock");
        } else if (choice.equalsIgnoreCase("a")) {
            return new Ash("Ash");
        } else return null;
    }
}
