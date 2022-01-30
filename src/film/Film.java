package film;

import java.util.Scanner;

public class Film {
    String judul;
    String genre;
    int durasi;
    String tahun;
    public Film next;
    public static Scanner in = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public void input() {
        System.out.print("Judul Film : ");
        judul = str.nextLine();
        System.out.print("Genre Film : ");
        genre = str.nextLine();
        System.out.print("Durasi Film (menit) : ");
        durasi = in.nextInt();
        System.out.print("Tahun Rilis : ");
        tahun = str.nextLine();
        Film next= null;
    }

    public void view() {
        System.out.println("Judul Film : " + judul);
        System.out.println("Genre Film : " + genre);
        System.out.println("Durasi Film (menit) : " + durasi);
        System.out.println("Tahun Rilis : " + tahun);
    }

    public static void main(String[] args) {
        int menu = 0;
        linked st = new linked();
        while (menu != 4) {
            System.out.print("1.push\n2.pop\n3.view\n4.exit\n : ");
            menu = in.nextInt();
            if (menu == 1) {
                Film baru = new Film();
                baru.input();
                st.push(baru);
            } else if (menu == 2)
                st.pop();
            else if (menu == 3)
                st.view();
            else if (menu == 4)
                System.out.println("keluar . . .");
            else
                System.out.println("salah . . .");
            System.out.println(" ");
        }
    }
}

class linked {
    Film top;

    public linked() {
        top = null;
    }

    public void push(Film a) {
        if (top == null)
            top = a;
        else {
            a.next = top;
            top = a;
        }
    }

    public void pop() {
        if (top == null)
            System.out.println("kosong");
        else {
            System.out.println("Popping Data . . .");
            top.view();
            top = top.next;
        }
    }
    
    public void view() {
        if (top == null)
            System.out.println("kosong");
        else {
            Film ptr = top;
            while (ptr != null) {
                System.out.println("- - - - -");
                ptr.view();
                ptr = ptr.next;
            }
        }
    }
}