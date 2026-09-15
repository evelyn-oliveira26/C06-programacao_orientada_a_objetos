package pcmania;

import java.util.Scanner;

import pcmania.modelo.Cliente;
import pcmania.modelo.Computador;
import pcmania.modelo.HardwareBasico;
import pcmania.modelo.MemoriaUSB;
import pcmania.modelo.SistemaOperacional;
import pcmania.servico.ProcessarPedido;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente("Evelyn", "123.456.789-00");

        //hardware do computador 1 - Apple
        HardwareBasico[] hardware1 = new HardwareBasico[3];

        hardware1[0] = new HardwareBasico("Processador i5", 2200);
        hardware1[1] = new HardwareBasico("Memoria RAM", 8);
        hardware1[2] = new HardwareBasico("HD", 500);

        SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);

        Computador pc1 = new Computador("Apple", 686, hardware1, so1);

        MemoriaUSB usb1 = new MemoriaUSB("Pen-drive", 16);

        pc1.addMemoriaUSB(usb1);

        //hardware do computador 2 - Samsung
        HardwareBasico[] hardware2 = new HardwareBasico[3];

        hardware2[0] = new HardwareBasico("Processador i7", 3370);
        hardware2[1] = new HardwareBasico("Memoria RAM", 16);
        hardware2[2] = new HardwareBasico("HD", 1000);

        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);

        Computador pc2 = new Computador("Samsung", 687, hardware2, so2);

        MemoriaUSB usb2 = new MemoriaUSB("Pen-drive", 32);

        pc2.addMemoriaUSB(usb2);

        //hardware do computador 3 - Dell
        HardwareBasico[] hardware3 = new HardwareBasico[3];

        hardware3[0] = new HardwareBasico("Processador i7", 4500);
        hardware3[1] = new HardwareBasico("Memoria RAM", 32);
        hardware3[2] = new HardwareBasico("HD", 2000);

        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);

        Computador pc3 = new Computador("Dell", 688, hardware3, so3);

        MemoriaUSB usb3 = new MemoriaUSB("HD Externo", 1000);

        pc3.addMemoriaUSB(usb3);

        //menu
        int codigo;

        do {
            System.out.println("Escolha a promoção:");
            System.out.println("1 - Apple   - R$ 686");
            System.out.println("2 - Samsung - R$ 687");
            System.out.println("3 - Dell    - R$ 688");
            System.out.println("0 - Finalizar");

            System.out.print("Opção: ");
            codigo = entrada.nextInt();

            if (codigo == 1) {
                cliente.comprar(pc1);

            } else if (codigo == 2) {
                cliente.comprar(pc2);

            } else if (codigo == 3) {
                cliente.comprar(pc3);
            }

        } while (codigo != 0);

        System.out.println();
        cliente.mostraDados();
        ProcessarPedido.enviarPedido(cliente.getComputadores());
        entrada.close();
    }
}
