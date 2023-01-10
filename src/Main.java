public class Main {
    public static void main(String[] args)
    {
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Book prestuplenieINakazanie= new Book("Преступление и наказание", dostoevsky, 1865);
        prestuplenieINakazanie.setYear(1866);
        System.out.println("Название: " + prestuplenieINakazanie.getName() + ", Автор: " + prestuplenieINakazanie.getAuthor().getFullName() + ", Год публикации: " + prestuplenieINakazanie.getYear());
        Author oruell = new Author("Джордж", "Оруэлл");
        Book best = new Book("1984", oruell, 1949);
        System.out.println("Название: " + best.getName() + ", Автор: " + best.getAuthor().getFullName() + ", Год публикации: " + best.getYear());
        Book scotniyDvor = new Book("Скотный двор", oruell, 1945);
        System.out.println("Название: " + scotniyDvor.getName() + ", Автор: " + scotniyDvor.getAuthor().getFullName() + ", Год публикации: " + scotniyDvor.getYear());
    }
}