Members 
1. Patil bajrang(SESP)
2. Chargundi Vaishali(SESP)
3. Kaushik HAtte(SESp)

#  Online Shopping System with Hibernate

## Features
- **User Management**
  - User registration and authentication
  - Profile management
  - Address book functionality

- **Product Catalog**
  - Product categories and listings
  - Search and filtering
  - Product details and reviews

- **Shopping Cart**
  - Add/remove items
  - Quantity adjustment
  - Save for later functionality

- **Order Processing**
  - Checkout process
  - Order history
  - Order tracking

- **Admin Panel**
  - Product management
  - Order management
  - User management
 
## Technologies Used

- **Backend**
  - Java 17+
  - Hibernate ORM 6.2.7
  - MySQL 8.0

- **Frontend**
  - HTML5, CSS3
  - JavaScript
  - JSP/Servlets

- **Tools**
  - Maven
  - Git
  - Eclipse/IntelliJ IDEA

Configuration
The main configuration files are:

src/main/resources/hibernate.cfg.xml - Hibernate configuration

src/main/webapp/WEB-INF/web.xml - Servlet configuration

pom.xml - Maven dependencies

Project Structure
online-shopping/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── onlineshopping/
│   │   │           ├── controller/      # Servlet controllers
│   │   │           ├── dao/             # Data Access Objects
│   │   │           ├── entity/          # Hibernate entities
│   │   │           ├── service/         # Business logic
│   │   │           └── util/            # Utility classes
│   │   ├── resources/                   # Configuration files
│   │   └── webapp/                      # Web content
│   └── test/                            # Test cases
├── pom.xml                              # Maven configuration
└── README.md                            # Project documentation

Contributing
Contributions are welcome! Please follow these steps:

Fork the repository

Create your feature branch (git checkout -b feature/AmazingFeature)

Commit your changes (git commit -m 'Add some AmazingFeature')

Push to the branch (git push origin feature/AmazingFeature)

Open a Pull Request


Project Output Overview:

Database Structure Created:
mysql> SHOW TABLES;
+--------------------------+
| Tables_in_online_shopping |
+--------------------------+
| users                    |
| products                 |
| orders                   |
| order_items              |
| categories               |
| product_categories       |
+--------------------------+

Web Interface Flow:
 [User Registration Form]
---------------------------------
Email:        [___________]
Password:     [___________]
Full Name:    [___________]
Address:      [___________]
Phone:        [___________]

[Register Button]

Product Listing Page:
[Online Shopping - Products]
---------------------------------
[Search Bar] [Cart (0)]

1. Smartphone XYZ - $599.99 [Add to Cart]
   ★★★★☆ (128 reviews)
   
2. Wireless Headphones - $89.99 [Add to Cart]
   ★★★★★ (256 reviews)

3. Laptop Pro - $1299.99 [Add to Cart]
   ★★★★☆ (78 reviews)

Shopping Cart Page:
[Your Shopping Cart]
---------------------------------
1. Smartphone XYZ - $599.99
   Quantity: [2] [Update] [Remove]
   
2. Wireless Headphones - $89.99
   Quantity: [1] [Update] [Remove]

Subtotal: $1289.97
Tax: $90.30
Total: $1380.27

[Proceed to Checkout]

Order Confirmation Page:
[Order Confirmation #1001]
---------------------------------
Thank you, John Doe!
Your order has been placed successfully.

Delivery Address:
123 Main St, Apt 4B
New York, NY 10001

Expected Delivery: July 20, 2023

[Continue Shopping]

Admin Panel Output:
[Admin Dashboard - Products]
---------------------------------
[Add New Product]

ID  Name                Price    Stock  Actions
------------------------------------------------
1   Smartphone XYZ      $599.99   50    [Edit][Delete]
2   Wireless Headphones $89.99    120   [Edit][Delete]
3   Laptop Pro         $1299.99   15    [Edit][Delete]

[Admin Dashboard - Orders]
---------------------------------
Order#  Customer         Date        Total    Status
----------------------------------------------------
1001    John Doe     2023-07-15   $1380.27  Processing
1002    Jane Smith   2023-07-14    $599.99  Shipped
1003    Mike Brown   2023-07-13    $299.97  Delivered

Screenshots:
C:\Users\BAJRANG\Pictures\Screenshots\h1.png
C:\Users\BAJRANG\Pictures\Screenshots\h2.png
C:\Users\BAJRANG\Pictures\Screenshots\h3.png
C:\Users\BAJRANG\Pictures\Screenshots\h4.png
C:\Users\BAJRANG\Pictures\Screenshots\h5.png
C:\Users\BAJRANG\Pictures\Screenshots\h6.png
C:\Users\BAJRANG\Pictures\Screenshots\h7.png




Contact
For any queries, please contact:

Bajrang Patil
Email: patilbajrang2913@gmail.com
GitHub: @patilbajrang2913
