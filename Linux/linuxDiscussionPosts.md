LINUX FUNDAMENTALS DISCUSSION POSTS: FALL 2025, PBSC



Question 1 - Proper Configuration of File & Directory Permissions

1. Discuss the importance of properly configuring file & directory permissions on a Linux server.

Setting up file & directory permissions correctly from the beginning of a project is extremely important for keeping your files secure & organized. The permissions you have set ultimately determine who can read, write, or execute files. Without knowing the proper protocols beforehand, you risk giving someone else access to your information.

2. Outline any security issues that you have encountered in the past as a result of using the default or less restrictive permissions on files or directories, or you might encounter in the future.

Thankfully, I haven't had to deal with any serious security concerns regarding permissions myself, but now that I'm aware of the potential risks, I'm more cautious & deliberate about setting permissions correctly for any project in the command line. 

Question 2 - Managing Directory Tasks from Linux Command Line

1. Discuss your thoughts about handling basic directory tasks from the Linux command line.

I'm confident in my ability to use essential commands, such as cd, ls, mkdir & pwd. However, I'm finding it more difficult to memorize the flags/options that follow them. This is probably because we use the flags less frequently than the commands. I researched online for another image with multiple flags in one place. Please feel free to take a copy for yourself [2].

2. Do they feel that working from the command line increases or decreases their productivity? When working from Windows, do they generally use or avoid using the command line interface?

Using the command line has increased my productivity because it's forced me to become more organized. Previously, I just kind of dragged & dropped files into random folders, but now I know I can easily keep track of everything [3]. I've enjoyed using Windows PowerShell primarily, which is where I first started working from the command line, to add repositories to my GitHub account. Git commands are essential in creating a consistent workflow. Nowadays, anytime I'm doing any hands-on coding, I start from the command line & end at the command line to ensure none of my work is lost. Now that I'm learning more about Linux, I'm able to get a full perspective on all the different universal (Git) & non-universal (Linux) commands to use. 

references

[1] McBrien, S. (2023, January). Linux File Permissions Explained. Redhat.com: https://www.redhat.com/en/blog/linux-file-permissions-explained 

[2] GeeksforGeeks, (2023, July). Linux Commands Cheat Sheet. GeeksforGeeks.com: https://www.geeksforgeeks.org/linux-unix/linux-commands-cheat-sheet/ 

[3] Sotiris Kourouklis. (2024, April). Improve Your Productivity by Using More Terminal & Less Mouse. DEV.to: https://dev.to/sotergreco/improve-your-productivity-by-using-more-terminal-




Question 1 - Different Filesystem Experiences

A) Discuss any experiences you may have with different filesystems. What are some of the reasons you might typically choose one filesystem over another? What Windows file systems do you typically use & why? If any?

B) Why might one administrator choose one Linux filesystem over another? If you do not have any experiences, feel free to project or create a possible scenario to address the question.

Imagining a world without a uniform filesystem structure is both scary & confusing! With hindsight, I guessed that a major reason why Linux didn't have one initially was probably because, for most programmers at the time of its inception (1991), there still wasn't a universal consensus about these sorts of architectural concepts that are commonplace nowadays. Or that most people choose one system over another, largely depending on user satisfaction from an intuitive layout at the bare minimum. But after doing some more reading & research, the original lack of a single "default" filesystem in Linux was largely due to ongoing technological advancement, not a lack of architectural consensus on how the filesystem should be laid out. One of the major standards that was adopted is the FileSystem Hierarchy Standard, or FHS for short. This provides for a uniform directory structure (i.e., /etc, /home, etc.) [1].

When choosing which sort of filesystem to use for a project, a programmer's choice is generally made depending on the requirements of the server or storage [2]. On the surface, one of the bigger shortcomings of Linux is that, given its free-to-use nature, larger enterprises can't always rely on it for customer support because there is no inherent customer support feature, which would be a disaster in emergencies like a power outage. But nowadays, there are several paid Linux distributions that offer 24/7 customer support, like Red Hat Enterprise Linux (RHEL) [3].


references.

[1] Cengage, (2016). LearningCompTIA Linux + Guide to Linux Certification (5th ed.).

[2] Linux Journal, (2019). Filesystem Hierarchy Standard via LinuxJournal.com: https://www.linuxjournal.com/content/filesystem-hierarchy-standard 

[3] Red Hat, (2019). Red Hat Enterprise Linux Operating System via Redhat.com: https://www.redhat.com/en/technologies/linux-platforms/enterprise-linux






Question 2 - Linux Installation Challenges

A) Discuss some of the problems that you may have encountered when attempting to install Linux in the past.

I don't have any personal hands-on experience in attempting to install Linux in the past or recently, I've only worked in virtual terminals before. But the biggest setback that's prevented me from using it is the lack of a real need to use it. With my previous experience working inside Windows PowerShell already & having them preinstalled on all the devices I currently use, I haven't needed to venture outside this realm yet. The only other tangible practice I have with Linux, is through using the terminal in GitHub to test the code I'm working on. But once again, no installation process is required. After learning more about the pros & cons of Linux from this class, I'd definitely be willing to give it a shot though! I don't feel nervous about attempting to try it either. One of the biggest setbacks I envision happening for me personally would be my lack of experience in using popular Linux specific terminal commands. Another setback that I've read about are bootloader issues, which are essentially complications stemming from the use of two systems on one device, like Windows & Linux together. 

B) What were some of the issues that you came across & how did you resolve them? In what ways has hardware support in Linux improved in the last few years?

The way I would go about resolving my lack of knowledge for particular Linux specific terminal commands would be first to search online for one or two commands that I could use which upon execution would display a pre-made list of default Linux specific terminal commands. After, I would search online for lists of Linux specific commands that have been curated by other Linux users online. I can't speak decisively about any Linux hardware support advancements in recent years, I imagine there are a greater amount of resources available presently, as opposed to five or even ten years ago. With more kernel updates & automated driver tools nowadays, it'd be hard to imagine the support aspect digressing over time. 

 

References.

[1] Kili, A. (N.D.). How to Determine & Fix Boot Issues in Linux via tecmint.com: https://www.tecmint.com/find-and-fix-linux-boot-issues/
[2] Eckert, J. (2015). Linux+ & LPIC-1 Guide to Linux Certification via Cengage Learning.
[3] The Linux Kernel Archives. (2019) via kernel.org: https://www.kernel.org/






Question 1 - Programming & Scripting

A) Discuss any personal experiences with programming & whether scripting is something that you might consider using regularly. If you have not been entirely successful with programming & scripting, what are some of the elements that you find most challenging? If you do not have any experiences, feel free to project or create a possible scenario to address the question.

I've been using scripting languages to help organize the coding files I've been working with for over two years now & I can't imagine it any other way. When I originally learned how to code three years ago, I was taught to manually import files into programs like Pair, which served as my host & in turn published them online. While this method is effective & accomplishes deployment at a relatively easy level, you can't make any dynamic changes outside of manually moving files from one place to another. With scripting, I learned how to keep things organized from the start, but I also successfully learned how to navigate in & out of different directories, make new directories or files & a lot more. Any commands or actions that I'm unfamiliar with, I simply look them up online; GeeksforGeeks has served as a constant go-to for these sorts of things

While I haven't experienced any major obstacles from scripting on my own, programming has grown to be increasingly challenging for me. This mainly stems from my academic weak spot, math. I understand the code I read for the most part (at a novice level), but writing it out from scratch is a lot more challenging than I had anticipated. However, with regular practice and hands-on coding with a tutor, some of the unfamiliarity is beginning to wane, thankfully. My only regret is not working with a tutor sooner. I would challenge any other computer programming major in this class to do the same. Even if you're doing well in this class or any other computer classes you're taking currently, any extra hands-on practice will cumulatively help you in the long run. It works the same way with learning any natural language, like Spanish or French.

 

References.
[1] GeeksforGeeks, (2016, March). What’s the Difference Between Scripting & Programming Languages? via geeksforgeeks.com: https://www.geeksforgeeks.org/javascript/whats-the-difference-between-scripting-and-programming-languages/
[2] Feldman, J. (2023, April). What is Scripting? via coursereport.com: https://www.coursereport.com/blog/a-beginners-guide-to-scripting-with-flatiron-school
[3] Eckert, J. (2015). Linux+ & LPIC-1 Guide to Linux Certification (5th ed.) via Cengage Learning.





1) "Linux & Windows Boot Loader: Discuss whether you would prefer to use a Linux or Windows boot loader on their home OS & explain their reasons why."

I would prefer to use a Windows boot loader, not because of personal preference necessarily, but more so just from having prior experience using Windows over Linux. I might be wrong, but I feel like most people would choose using the same reasoning. After watching both of the videos above, I don't think using Linux boot loaders are that much different overall. While variations in syntax are clear, like with Linux' 'GRUB' boot loader versus Windows 'bdcedit' boat loader, the more I learn about Linux the more I feel inclined to choosing it for my own personal use.

The only real setback I have regarding boot loaders is my willingness to try it out on my own laptop at home just for fun, as I'd still prefer to work in virtual environments for now at least. But from what I've read, GRUB is often viewed as a more intuitive & flexible choice because it uses plain text files for configuration. This is another reason why many developers have chosen it over its Windows counterpart because it's viewed as easier to manage multi-boot systems via Linux. I would recommend taking a cautious approach to 'dabbling' with installing & uninstalling different operating systems outside of virtual environments on your own device though because the results could be irreversible if you don't pay close enough attention to detail. Just be careful out there!

References.
[1] G. Whittaker. (2024, March). Integrating Linux & Windows in a Dual-Boot Setup | Linux Journal via linuxjournal.com: https://www.linuxjournal.com/content/integrating-linux-and-windows-dual-boot-setup
[2] Lenovo. (2021). What is Dual Boot & How to Dual Boot Windows & Linux via lenovo.com: https://www.lenovo.com/us/en/glossary/what-is-dual-boot/?orgRef=https%253A%252F%252Fwww.google.com%252F&srsltid=AfmBOorz2Of6ziWmzCm3x1Fx7ehqhARHB5ieZIV87XoZaZRNQAll-EpC 
[3] Cengage Learning. (2016). LearningCompTIA Linux + Guide to Linux Certification (5th ed.).






Question 1 - Common Administrative Tasks

Discuss some of the common administrative tasks that you think could probably be automated by using either the at or cron daemons. On average, how much time do you think an administrator could save compared to carrying out similar tasks on a Windows system?

Troubleshooting is one of the primary responsibilities of any Linux system administrator (sysadmin). Utilizing the at & cron daemons enables any Linux sysadmin to focus on proactive maintenance & optimization. The cron daemon is designed for scheduling tasks inside Linux, which frees up the sysadmin from manually performing repetitive actions. It can also back up data on its own & generate system reports. The at daemon is designed for one-time executions, which work best when handling large system updates. For example, if the system knows a large time-consuming update is inbound, it will wait until a 'non-peak' time to allow it to process & then it will shut down the system once more after it's been completed. 

Controlling access to the systems we work in is essential to securing them. Another way the cron daemon ensures access is as secure as possible is by allowing it to check for system updates regularly & to implement those updates shortly after they become available at 'non-peak' times, like when everyone is sleeping. I know that out of habit, we can get comfortable with whatever we've been working with, but regularly adjusting to these updates ensures that any previous security breaches will not happen in the same fashion again. Overall, the tasks automating your at or cron daemons could save a sysadmin 1 - 3 hours per week when compared with Windows Task Scheduler or other third-party programs. This is also due to Linux's lightweight, user-intuitive design, which works in the terminal, whereas Windows Task Scheduler has a GUI interface.

References.
[1] Cengage Learning. (2016). LearningCompTIA Linux + Guide to Linux Certification (5th ed.).
[2] RedHat. (2021). 17 Linux Commands Every sysadmin Should Know via redhat.com: https://www.redhat.com/en/blog/linux-commands-to-know
[3] Yellow Tail Teach. (2025, September). What are Linux Admin Job Responsibilities? via yellowtail.tech: https://yellowtail.tech/article/what-are-the-linux-admin-responsibilities/





Question 1 - Log Files on a Linux System

Discuss the various log files found on a Linux system. Based on your own experiences, how often do you feel you would check these files & how vigilant do you think you would be about the process?

While I haven't had the opportunity to test most of the commands we learned in the videos above yet myself, I have needed to access log files inside a program named Docker via Windows to fix some bugs for an application I helped build the other year. That helped teach me the importance of logs, so that if the app you're building ever 'breaks', checking the logs is an essential step in diagnosing what exactly went wrong in your code so you can fix it. I've saved a lot of screenshots from the videos above & pasted them into my Notion digital notebook for reference, along with links to those videos because they were chock-full of good information. It might not seem important at first, but these commands will become essential in any sort of application you can build using Linux; the possibilities are limitless. Whether a project is finished or still in the development phase, accessing the logs is vital to understanding exactly what is going on 'under the hood'.

In the future, I plan on using Linux logs on a regular basis during the development phase & maybe on a weekly or b-weekly basis once I am maintaining the program that was built. I would use it on a daily basis during the development phase because it would enable me to easily test everything I've built in real-time. Once the program is up & running, I won't need to test the code frequently due to all of the requirements being met, but I will still have to ensure everything is functioning properly while it's still under my management. Regarding specific commands, cat /var/log/syslog, stands out as one that I'll need to use for general purposes. The same can be said for journalctl, which outputs the logs collected by the systemd journal. I remember learning about the head & tail commands in a previous module, but discovering more that can be used with them is sure to be useful in viewing chunks of code from either the top or bottom of the program. Tail.daemon.log would be great for understanding system issues, while tail dpkg.log enables users to view snippets of the package log. 

References.
[1] SolarWInds. (2018). Linux Logging Basics | Loggly via Loggly.com: https://www.loggly.com/ultimate-guide/linux-logging-basics/
[2] RedHat. (2022). How to Find & Interpret System Log Files on Linux via Redhat.com: https://www.redhat.com/en/blog/rsyslog-systemd-journald-linux-logs
[3] Cengage Learning. (2016). LearningCompTIA Linux + Guide to Linux Certification (5th ed.).






2. Based on the network environments you use (either Linux or Windows), please find any article related to the network environment you use. Discuss the benefits of using the environment, at least 2 problems, & solutions for using & managing the environment. Feel free to cite the article(s) at least 2 times to support your critical analysis.

For most of my life, I've exclusively worked inside Windows environments, but I've been trying to work inside a Linux virtual environment recently after my Python tutor showed me how to use Copespaces inside GitHub. So, apart from this class, that's the only other true experience I have working hands-on with Linux systems. In the end, they will both deliver the same results, but user preference on how they get to their end destination can vary greatly. The most common problem Windows users face is that they can leave themselves vulnerable without realizing it by using older commands, such as xcopy, over updated ones that maintain data integrity. This is one reason why Linux is often viewed as more secure than Windows, which is generally true. In response, you can also use file utilities as a security measure, such as Robocopy, which offers better ways to handle incoming errors. One major benefit to working inside a Windows network environment is that it's compatible with almost any program you could think of.

Another major benefit of working inside a Linux environment over Windows is that it gives users greater flexibility because it is a lot more customizable than Windows. One major shortcoming of Linux systems when compared with Windows is the learning curve itself. This is because the Linux command line interface (CLI) looks & operates differently when compared with the Windows graphical user interface (GUI). One way to overcome this is by working inside a user-friendly distribution like Linux Mint, which offers a more familiar GUI. Understanding the specific differences of compatibility is another setback, whereas popular programs like Adobe Creative Suite aren't built for Linux environments whatsoever. This ensures that any Linux user is prepared to search for other open-source alternatives, such as GIMP or Blender.
Despite some of these stark differences, this class has helped push me outside of my comfort zone in a positive way & I feel confident about learning more about Linux system use in my spare time because I'm a computer programming major & I know I will encounter them again.

References.
[1] Zacks, S. (2024, March). Is Linux Really More Secure than Windows? | PIA Inc via privateinternetaccess.com: https://www.privateinternetaccess.com/blog/linux-vs-windows/
[2] 
Hostman. (2025, September). Linux vs Windows: Comparison, Pros & Cons. | Hostman LTD via hostman.com: https://hostman.com/blog/linux-vs-windows/ 
[3]  Cengage Learning. (2016). LearningCompTIA Linux + Guide to Linux Certification (5th ed.).






2. Discuss working with databases. Define relational database. Do you have experience with relational databases? What are some of the pitfalls that can be encountered when working with relational databases?

In the most simple of terms, relational databases are digital databases that organize & store data inside of tables. I have experience working with a few different types of databases online, although I don't have a ton of experience working with any of them in particular. I've used SQL Lite while practicing inside the Codecademy app & I built a few small non-commercial software apps that relied on MySQL & PostGreSQL databases. Out of all of them, I probably have the most experience working inside of a non-relational NoSQL database, MongoDB, when I helped build a soccer league monitor for a group project last year.

While I don't have a 'favorite' or preferred system to work with, since I've pretty much worked with relational & non-relational databases evenly, from my experience relational databases are a lot more complex & less intuitive. On the other hand, the GUI interface for the non-relational MongoDB made my experience a lot more enjoyable & I would probably choose using that again for building another personal project for my portfolio, while I'd choose to use a relational database for personal use. One of the major pitfalls you could encounter using relational databases is that they don't handle rapid changes to schemas well, which makes them less agile for software apps that are updated often. Another important pitfall to avoid is the costly nature of large, enterprise relational databases, mostly due to expensive licensing fees.

References.
[1] Oracle. (June, 2021). What is a Relational Database? | via oracle.com: https://www.oracle.com/database/what-is-a-relational-database/
[2] Codecademy. (N.D.). What is a Relational Database? | via codecademy.com: https://www.codecademy.com/article/relational-database-rdbms
[3] Cengage Learning. (2016). LearningCompTIA Linux + Guide to Linux Certification (5th ed.).






Question 2 - Costs and Payoffs of Implementing Security Measures

Discuss the costs and payoffs of implementing all the security measures mentioned in this section. Which security measures do you think is of the greatest importance? Which seem to have a greater cost (in terms of convenience or time requirements) than benefit (in terms of security provided)?

The security benefits gained from implementing Linux monitoring tools outweigh the costs, mostly because the payoff is risk mitigation versus a disaster like system compromise. The main cost is the administrative time & skill required to run & interpret tools like iostat or mpstat like we learned about this past module. This sort of investment yields the payoff of system stability & availability. One of the most fundamental security measures to test network reachability is by using either the ping or traceroute Linux commands in the terminal, of which we have both used in class already too. These commands provide a payoff by confirming network integrity, which ensures that the system can communicate with others securely.

The tools that often have a greater cost than benefit for routine security monitoring are those focused on micro-level performance profiling like advanced vmstat flag usage. While essential for system optimization, the significant time & convenience cost associated with interpreting these complex statistics every day outweighs the security gain they provide. Personally, I think that proactive use is the most important measure because it ensures that you're able to detect threats early on, which can significantly reduce the high costs associated with recovering from a security disaster. These basic network checks cost next to nothing, the same can be said for learning & implementing them. 

References.
[1] Cengage, (2016). LearningCompTIA Linux + Guide to Linux Certification (5th ed.).
[2] Yellow Tail Tech (n.d.). The Power & Protection of Linux Security. | via yellowtail.tech: https://yellowtail.tech/learn/linux/security/why-linux-security-matters/
[3] Linux Foundation. (2023, March). The Value of Open Source Software is More Than Cost Savings. | via linuxfoundation.org: https://www.linuxfoundation.org/blog/the-value-of-open-source-software-is-more-than-cost-savings
[4] Gite, V. (2009, June). 30 Linux System Monitoring Tools Every SysAdmin Should Know. | NixCraft via cyberciti.biz: https://www.cyberciti.biz/tips/top-linux-monitoring-tools.html
