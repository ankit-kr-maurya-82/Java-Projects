import java.sql.*;

class Ecommerce {

    static String url = properties.getProperty("url");
    static String user = properties.getProperty("user");
    static String password = properties.getProperty("password");

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            if (con.isValid(5)) {
                System.out.println("Connected to database!");
            }
            return con;
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }

    public static void displayProducts() {
        Connection con = connect();
        if (con == null) return;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM products");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("product_name");
                double price = rs.getDouble("price");
                System.out.println(id + ". " + name + " - Rs. " + price);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try { con.close(); } catch (Exception e) {}
        }
    }

    public static void addProduct(String name, double price) {
        Connection con = connect();
        if (con == null) return;
        try {
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO products (product_name, price) VALUES (?, ?)");
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.executeUpdate();
            System.out.println("Product added: " + name);
            ps.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try { con.close(); } catch (Exception e) {}
        }
    }

    public static void deleteProduct(int id) {
        
        Connection con = connect();
        if (con == null) return;
        try {
            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM products WHERE id = ?");
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Product deleted (ID: " + id + ")");
            else
                System.out.println("Product not found (ID: " + id + ")");
            ps.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try { con.close(); } catch (Exception e) {}
        }
    }

    public static void line(int l) {
        for (int i = 0; i < l; i++) System.out.print("-");
    }

    public static void linebreak() {
        System.out.println();
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            line(30);
            linebreak();
            System.out.println("  Ecommerce Platform");
            line(30);
            linebreak();
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            linebreak();

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    addProduct(name, price);
                    break;
                case 3:
                    System.out.print("Enter product ID to delete: ");
                    int id = sc.nextInt();
                    deleteProduct(id);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
            linebreak();
        }
    }
}   