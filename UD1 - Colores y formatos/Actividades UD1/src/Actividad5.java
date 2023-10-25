public class Actividad5 {
    
    public static void main(String[] args) {
        System.out.println(ConsoleColors.CYAN_BOLD + "                                HORARIO DE CLASE                            ");
        System.out.printf(ConsoleColors.GREEN_BOLD + "%-20s    %-10s   %-10s    %-10s     %-10s    %-10s\n" , "HORARIO", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf(ConsoleColors.WHITE_BOLD + "%-20s    %-10s   %-10s    %-10s     %-10s    %-10s\n" , "15:15 a 16:15", "S.I", "S.I", "BAS.DATOS", "LMGSI", "BAS.DATOS");
        System.out.printf(ConsoleColors.WHITE_BOLD + "%-20s    %-10s   %-10s    %-10s     %-10s    %-10s\n" , "16:15 a 17:15", "S.I", "S.I", "BAS.DATOS", "LMGSI", "BAS.DATOS");
        System.out.printf(ConsoleColors.WHITE_BOLD + "%-20s    %-10s   %-10s    %-10s     %-10s    %-10s\n" , "17:15 a 110:15", "S.I", "S.I", "PROG", "PROG", "PROG");
        System.out.printf(ConsoleColors.WHITE_BOLD + "%-20s    %-10s   %-10s    %-10s     %-10s    %-10s\n" , "110:30 a 19:30", "FOL", "E.DES", "PROG", "PROG", "PROG");
        System.out.printf(ConsoleColors.WHITE_BOLD + "%-20s    %-10s   %-10s    %-10s     %-10s    %-10s\n" , "19:30 a 20:30", "FOL", "E.DES", "PROG", "BAS.DATOS", "LMGSI");
        System.out.printf(ConsoleColors.WHITE_BOLD + "%-20s    %-10s   %-10s    %-10s     %-10s    %-10s\n" , "20:30 a 21:30", "FOL", "E.DES", "PROG", "BAS.DATOS", "LMGSI");

    }
}