package util;

import rare.earth.metals.metalserviceupdater.dao.MetalsDao;
import rare.earth.metals.metalserviceupdater.model.Metal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private MetalsDao dao;

    @Override
    public void run(String...args) throws Exception {
        dao.deleteAll();
        dao.save(new Metal(
                "1",
                "Rutherfordium",
                "Symbol:  Rf [ element ]\n" +
                        "Atomic number:  104\n" +
                        "Atomic weight:  [265]\n" +
                        "Ionization energy, eV:  (6.01)\n" +
                        "Molecular formula:  Rf\n" +
                        "\n" +
                        "Molecular weight:  267.122 g/mol\n" +
                        "\n" +
                        "CAS Registry Number (CAS RN):  53850-36-5",
                1_645_900L,
                "https://www.geocities.ws/jeshuamalimata/" +
                        "2nd/periodic_table_malimata/Rf.jpg"));
        dao.save(new Metal(
                "2",
                "Dubnium",
                "Symbol:  Db [ element ]\n" +
                        "Atomic number:  105\n" +
                        "Atomic weight:  [268]\n" +
                        "Ionization energy, eV:  (6.8)\n" +
                        "Molecular formula:  Db\n" +
                        "\n" +
                        "Molecular weight:  268.126 g/mol\n" +
                        "\n" +
                        "CAS Registry Number (CAS RN):  53850-35-4",
                3_678_678L,
                "https://cdn.dribbble.com/users/3013/" +
                        "screenshots/10679769/media/" +
                        "8ad2ce46f162ae93ba7ba464482f65c8.png"));
        dao.save(new Metal(
                "3",
                "Ytterbium",
                "Atomic number\t70\n" +
                        "Electronegativity according to Pauling\t1.1\n" +
                        "Density\t7 g.cm-3 at 20°C\n" +
                        "Melting point\t824 °C\n" +
                        "Boiling point\t1466 °C",
                34_987L,
                "https://cdn.dribbble.com/users/3013/" +
                        "screenshots/4794419/yterrbium.png"));
        dao.save(new Metal(
                "4",
                "Neodymium",
                "Symbol:  Nd [ element  |  neodymium-based compounds ]\n" +
                        "Atomic number:  60\n" +
                        "Atomic weight:  144.242(3)\n" +
                        "Ionization energy, eV:  5.525\n" +
                        "Molecular formula:  Nd\n" +
                        "\n" +
                        "Molecular weight:  144.242 g/mol\n" +
                        "\n" +
                        "Molar volume:  20.585 cm³/mol\n" +
                        "\n" +
                        "CAS Registry Number (CAS RN):  7440-00-8",
                54_092L,
                "https://cdn.dribbble.com/users/3013/" +
                        "screenshots/10641214/media/6c5b6ce9e517ade745b0d5f11c5949ad.png?" +
                        "compress=1&resize=1000x750&vertical=top"));

    }
}
