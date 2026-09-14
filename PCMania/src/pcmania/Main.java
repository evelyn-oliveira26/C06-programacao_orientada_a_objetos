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
                HardwareBasico[] hardware = {
                        new HardwareBasico("Processador i5", 2200),
                        new HardwareBasico("Memoria RAM", 8),
                        new HardwareBasico("HD", 500)
                };
                Computador pc = new Computador("Apple", 686, hardware, new SistemaOperacional("macOS Sequoia", 64));
                pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));
                cliente.comprar(pc);

            } else if (codigo == 2) {
                HardwareBasico[] hardware = {
                        new HardwareBasico("Processador i7", 3370),
                        new HardwareBasico("Memoria RAM", 16),
                        new HardwareBasico("HD", 1000)
                };
                Computador pc = new Computador("Samsung", 687, hardware, new SistemaOperacional("Windows 8", 64));
                pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
                cliente.comprar(pc);

            } else if (codigo == 3) {
                HardwareBasico[] hardware = {
                        new HardwareBasico("Processador i7", 4500),
                        new HardwareBasico("Memoria RAM", 32),
                        new HardwareBasico("HD", 2000)
                };
                Computador pc = new Computador("Dell", 688, hardware, new SistemaOperacional("Windows 10", 64));
                pc.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
                cliente.comprar(pc);
            }

        } while (codigo != 0);

        System.out.println();
        cliente.mostraDados();
        ProcessarPedido.enviarPedido(cliente.getComputadores());

        entrada.close();
    }
}