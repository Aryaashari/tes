/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package belajarjava.todo_list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aryaa
 */
public class Todo_list {

    private static final ArrayList<String> todoList = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Menu Utama:");
                System.out.println("1. Tambah Todo");
                System.out.println("2. Lihat Todo");
                System.out.println("3. Hapus Todo");
                System.out.print("Pilih opsi: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();  // membersihkan newline character
                
                switch (pilihan) {
                    case 1 -> tambahTodo(scanner);
                    case 2 -> lihatTodo();
                    case 3 -> hapusTodo(scanner);
                    default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
        }
    }

    private static void tambahTodo(Scanner scanner) {
        System.out.print("Masukkan todo: ");
        String todo = scanner.nextLine();
        todoList.add(todo);
        System.out.println("Todo berhasil ditambahkan!");
    }

    private static void lihatTodo() {
        if (todoList.isEmpty()) {
            System.out.println("Todo list kosong.");
        } else {
            System.out.println("Daftar Todo:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }

    private static void hapusTodo(Scanner scanner) {
        lihatTodo();
        if (!todoList.isEmpty()) {
            System.out.print("Masukkan nomor todo yang akan dihapus: ");
            int index = scanner.nextInt();
            scanner.nextLine();  // membersihkan newline character
            if (index > 0 && index <= todoList.size()) {
                todoList.remove(index - 1);
                System.out.println("Todo berhasil dihapus!");
            } else {
                System.out.println("Nomor todo tidak valid.");
            }
        }
    }
}
