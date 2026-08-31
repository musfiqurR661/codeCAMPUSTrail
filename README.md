# 🎓 codeCAMPUSTrail

A feature-rich **campus social and learning platform** built with **Java (JavaFX)** and **MySQL**. codeCAMPUSTrail connects students and teachers in a shared digital campus environment — enabling social interaction, announcements, contests, learning resources, and real-time chat.

> 🔄 **For the updated version of this project, check out:** [@musfiqurR661/ExeCode](https://github.com/musfiqurR661/ExeCode) — a re-built web-based version of codeCAMPUSTrail built with **PHP**, featuring an online IDE, contest management, standings, rankings, and more.

---

## 🚀 Features

- 🔐 **Authentication** — User Sign Up & Login with role-based access (Student / Teacher)
- 🏠 **Home Page** — Personalized dashboard for both Students and Teachers
- 📰 **News Feed** — View and interact with posts from the campus community
- 📢 **Announcements** — Teachers can post and students can view campus announcements
- 🏆 **Contests** — Browse and participate in coding contests with a dedicated contest feed
- ❓ **Query Feed** — Post questions and browse queries from fellow students
- 📚 **Learning Portal** — Access learning resources and materials
- ✍️ **Create Posts** — Role-specific post creation for both Students and Teachers
- 💬 **Real-time Chat** — Client-server based chat room functionality (`Room.java`, `ClientHandler.java`)
- 🌐 **Web View Integration** — Embedded web browsing capabilities within the app
- 🏅 **Rankings** — Leaderboard/ranking system for students
- 🎨 **Animations** — Smooth UI animations using AnimateFX
- ⌨️ **Auto-Typing Text Effect** — Dynamic typing animations on the welcome screen

---

## 🛠️ Tech Stack

| Technology      | Details                        |
|-----------------|-------------------------------|
| **Language**    | Java 19 (96.1%)               |
| **UI Framework**| JavaFX 19.0.2.1 (FXML + CSS) |
| **Database**    | MySQL (via mysql-connector-j 8.0.32) |
| **Build Tool**  | Maven                         |
| **CSS Styling** | Custom CSS (3.9%)             |
| **Testing**     | JUnit Jupiter 5.9.2           |
| **Animations**  | AnimateFX 1.2.4               |

---

## 📁 Project Structure

```
codeCAMPUSTrail/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── module-info.java
│   │   │   └── com/example/project/
│   │   │       ├── Main.java                                  # Application entry point
│   │   │       ├── Start.java                                 # Startup/splash screen
│   │   │       ├── User.java                                  # User model
│   │   │       ├── Ranking.java                               # Ranking model
│   │   │       ├── Announcement.java                          # Announcement model
│   │   │       ├── Room.java                                  # Chat room logic
│   │   │       ├── ClientHandler.java                         # Chat client handler
│   │   │       ├── AutoTypingText.java                        # Animated typing text
│   │   │       ├── WebView.java / WebView2.java               # Embedded web browser
│   │   │       ├── Controller.java                            # Base controller
│   │   │       ├── MainController.java                        # Main layout controller
│   │   │       ├── HelloController.java                       # Welcome screen
│   │   │       ├── LogInPageController.java                   # Login page
│   │   │       ├── SignUpPageController.java                  # Sign-up page
│   │   │       ├── HomePageController.java                    # Home dashboard
│   │   │       ├── StudentController.java                     # Student dashboard
│   │   │       ├── TeacherController.java                     # Teacher dashboard
│   │   │       ├── NewsFeedController.java                    # News feed
│   │   │       ├── NewsfeedForAnnouncementController.java     # Announcement feed
│   │   │       ├── NewsfeedForContestAnnouncementController.java # Contest feed
│   │   │       ├── NewsfeedForQueryController.java            # Query feed
│   │   │       ├── ContestController.java                     # Contest page
│   │   │       ├── LearninPortController.java                 # Learning portal
│   │   │       ├── CreatPostPageForStudentController.java     # Student post creation
│   │   │       ├── CreatPostPageForTeacherController.java     # Teacher post creation
│   │   │       ├── HomeButton.css                             # Home button styles
│   │   │       ├── Css/                                       # Additional stylesheets
│   │   │       ├── icons/                                     # Icon assets
│   │   │       └── AnimateFX-1.2.4.jar                        # Animation library
│   │   └── resources/                                         # FXML & resource files
│   └── logo.png / logo1.png                                   # Application logos
├── musfiq.sql                                                 # Database schema & seed data
├── mysql-connector-j-8.0.32.jar                              # MySQL JDBC driver
├── pom.xml                                                    # Maven build config
└── mvnw / mvnw.cmd                                            # Maven wrapper scripts
```

---

## 🗄️ Database Setup

The project uses **MySQL**. A SQL dump is included at the root of the repository.

1. Create a MySQL database (e.g., `musfiq`).
2. Import the schema:

```bash
mysql -u root -p < musfiq.sql
```

The dump creates the `musfiq` database if it does not already exist.

Optional environment variables:

| Variable | Default |
|----------|---------|
| `CODECAMPUS_DB_URL` | `jdbc:mysql://127.0.0.1:3306/musfiq?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC` |
| `CODECAMPUS_DB_USER` | `root` |
| `CODECAMPUS_DB_PASSWORD` | *(empty)* |

The database includes the following tables:

| Table          | Description                          |
|----------------|--------------------------------------|
| `useraccounts` | Stores registered users (Students & Teachers) |
| `allpost`      | Stores all user-created posts        |

---

## ⚙️ Prerequisites

- **Java 19** or higher
- **Maven 3.6+**
- **MySQL** (running locally on `127.0.0.1`)
- **JavaFX 19** (managed via Maven)

---

## 🔧 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/musfiqurR661/codeCAMPUSTrail.git
cd codeCAMPUSTrail
```

### 2. Set Up the Database

Follow the [Database Setup](#️-database-setup) steps above.

### 3. Build the Project

```bash
./mvnw clean install
```

> On Windows:
> ```bash
> mvnw.cmd clean install
> ```

### 4. Run the Application

```bash
./mvnw clean javafx:run
```

> On Windows:
> ```bash
> mvnw.cmd clean javafx:run
> ```

---

## 👥 User Roles

| Role        | Capabilities                                                                 |
|-------------|------------------------------------------------------------------------------|
| **Student** | Sign up/login, view news feed, create posts, browse contests, ask queries, access learning portal, chat |
| **Teacher** | Sign up/login, post announcements, create posts, manage contest info, view student queries, chat |

---

## 📦 Dependencies

| Dependency              | Version    | Purpose                    |
|-------------------------|------------|----------------------------|
| `javafx-controls`       | 19.0.2.1   | JavaFX UI components       |
| `javafx-fxml`           | 19.0.2.1   | FXML layout support        |
| `mysql-connector-j`     | 8.0.32     | MySQL database connectivity|
| `AnimateFX`             | 1.2.4      | UI animations              |
| `junit-jupiter-api`     | 5.9.2      | Unit testing               |
| `junit-jupiter-engine`  | 5.9.2      | Test runner                |

---

## 🔄 Updated Version

Looking for a more feature-complete, web-based evolution of this project?

👉 Check out **[ExeCode](https://github.com/musfiqurR661/ExeCode)** — the updated version of codeCAMPUSTrail, rebuilt as a full web application using **PHP**. It includes:

- 🖥️ **Online IDE** — Write and run code directly in the browser
- 🏆 **Contest Management** — Full contest creation and participation system
- 🥇 **Standings & Rankings** — Real-time leaderboards
- 👤 **User & Admin panels** — Separate dashboards for users and administrators
- 📂 **Problem Sets & Practice Problems** — Structured coding challenges

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repository, make changes, and submit a pull request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 👨‍💻 Author

**Md Musfiqur Rahman**  
🔗 [GitHub Profile](https://github.com/musfiqurR661)

**Azizul Haque Noman**  
🔗 [GitHub Profile](https://github.com/azizulhaquenoman)

**Tarek Rahman**  
🔗 [GitHub Profile](https://github.com/tarekrahamn)

---

## ⭐ Show Your Support

If you find this project useful, please consider giving it a ⭐ on [GitHub](https://github.com/musfiqurR661/codeCAMPUSTrail)!
