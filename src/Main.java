public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Лев", "Николаевич", "Толстой");
        Author chehov = new Author("Антон", "Павлович", "Чехов");
        Author chehov2 =new Author("Антон", "Павлович", "Чехов");
        Book sadCherry = new Book("Вишневый сад", chehov, 1904);
        Book warAndPeace = new Book("Война и Мир", tolstoy, 1867);
        Book warAndPeace2 = new Book("Война и Мир", tolstoy, 1867);
        System.out.println("sadCherry.bookYear = " + sadCherry.getBookYear());
        sadCherry.setBookYear(1970);
        System.out.println("sadCherry.bookYear = " + sadCherry.getBookYear());
        System.out.println("warAndPeace = " + warAndPeace.getBookName());
        Book annaKarenina = new Book("Анна Каненина", tolstoy, 1877);
        System.out.println("tolstoy.getAuthorMiddleName() = " + tolstoy.getAuthorLastName());
        System.out.println(sadCherry.toString());
        System.out.println(tolstoy.toString());
        System.out.println(chehov2.equals(chehov));
        System.out.println(warAndPeace2.equals(warAndPeace));
        System.out.println(sadCherry.equals(warAndPeace));
        System.out.println(warAndPeace.hashCode());
        System.out.println(warAndPeace2.hashCode());
        System.out.println(annaKarenina.toString());

    }



}