package Zoo;

public class Lion extends Animaux {
    public Lion(String nom, String type, String cri) {
        super("lion" , "carnivore" , "roar");
    }

    public void afficherLion() {

        System.out.println("   \\|\\||\n" +
                "  -' ||||/\n" +
                " /7   |||||/\n" +
                "/    |||||||/`-.____________\n" +
                "\\-' |||||||||               `-._\n" +
                " -|||||||||||               |` -`.\n" +
                "   ||||||               \\   |   `\\\\\n" +
                "    |||||\\  \\______...---\\_  \\    \\\\\n" +
                "       |  \\  \\           | \\  |    ``-.__--.\n" +
                "       |  |\\  \\         / / | |       ``---'\n" +
                "     _/  /_/  /      __/ / _| |\n" +
                "    (,__/(,__/      (,__/ (,__/\n");
    }

    public void afficherLionRepos() {

        System.out.println("        \\|\\||\n" +
                "       -' |||/\n" +
                "      /7   |||/\n" +
                "     /    |||||/\n" +
                "     \\-' |||||||/`-.____________\n" +
                "      -|||||||||           /    `.\n" +
                "        |/||||             \\      \\\n" +
                " _______/    /_       ______\\      |__________-\n" +
                "(,__________/  `-.___(,_____________----------_)\n");

        System.out.println("Le lion dort");
    }
}
