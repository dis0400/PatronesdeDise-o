package Mediator;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Skype skype = new Skype();

        Dev dev1 = new Dev("Louis", "123", List.of("a", "b", "c"), skype);
        Dev dev2 = new Dev("Tom", "234", List.of("a", "b", "c"), skype);
        Dev dev3 = new Dev("Mariel", "345", List.of("a", "b", "c"), skype);

        QA qa1 = new QA("Laura Illanes", "456", "supervisor", skype);
        QA qa2 = new QA("Paola Illanes", "567", "gerente", skype);
        QA qa3 = new QA("Laura Kikoman", "678", "gerente", skype);

        SM sm1 = new SM("Quentin Tarantino", "789", "C#", skype);
        SM sm2 = new SM("Stanley Kubrick", "891", "C++", skype);
        SM sm3 = new SM("Sofia Coppola", "912", "Javascript", skype);

        skype.addDev(dev1).addDev(dev2).addDev(dev3).addQA(qa1).addQA(qa2).addQA(qa3).addSM(sm1).addSM(sm2).addSM(sm3);
        dev1.send("Probando 1 2 3");
        qa1.send("HOLA MUNDO");
        sm1.send("Hasta la proxima");
    }
}