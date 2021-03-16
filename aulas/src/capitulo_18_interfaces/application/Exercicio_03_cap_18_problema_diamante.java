package capitulo_18_interfaces.application;

import capitulo_18_interfaces.model.devices.ComboDevice;
import capitulo_18_interfaces.model.devices.ConcretePrinter;
import capitulo_18_interfaces.model.devices.ConcreteScanner;

public class Exercicio_03_cap_18_problema_diamante {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());

    }
}
