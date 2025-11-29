# 11/22/2025, Dialogue Update Complete, First Video Demo Rough Draft Ready 🍿
# https://bit.ly/440uRTX 

My PowerPoint presentation is starting to shape up into something worthwhile. Yesterday I finally finished writing the dialogue for my video demo & today I finished my first rough draft of the video demo itself. I sent it to my professor, & now I'm awaiting their feedback. After, I'm going to make one final take of my video demo before I upload it to YouTube, because I want to have it available with some of the other coding walk-through videos I have for my personal portfolio. The title of it is "Common Linux Admin Tasks & Commands. Oh & before I forget, I used a program named OBS Studio to do all the screen capturing. 


# 11/20/2025, Final Project Rough Draft Almost Ready 🎥
# https://bit.ly/4oQACw1 

I've been slowly collecting info & preparing my PowerPoint presentation for my final project. Today I'm writing the script for the video demo I have to include with my PowerPoint presentation. Once I'm done writing this script, I'll go through a test run & edit what's necessary before I submit it to my professor. Hopefully, they like where I'm going with this; however, I'm ready to handle any constructive feedback.


# 09/30/2025, Mod4: Linux Filesystem Management ⌨️
# https://youtu.be/vKTg1ATHl4E?si=UTntvUk-y1UTRydm
# https://youtu.be/4e669hSjaX8?si=Riz7QDmX-4AWkKua

Today in class, we learned how to use new commands in Linux. The two videos linked above aren't directly related to the code below, but that's what we reviewed before the lesson below, which is from a program inside of Cengage: MindTap called Lab Connection. We worked inside a virtual Linux terminal where we used various commands that I wrote below to demonstrate. I'm loving it so far because, having learned a few things about the Windows command line already, this new syntax isn't that much different from what I'm already used to using, like the commands: mkdir, cd, ls, pwd etc.



``` cp /etc/passwd ~/documents/work
cd ~/documents/work
cp passwd passwd2
mv passwd2 ~/documents/misc
rm -ri ~/documents/misc

su root
mkdir /home/LabConnection/documents/newprojects
ls -l /home/LabConnection/documents
chown LabConnection /home/LabConnection/documents/newprojects
ls -l /home/LabConnection/documents
su LabConnection
touch /home/LabConnection/documents/newprojects/project1
touch /home/LabConnection/documents/newprojects/project2
ls -l /home/LabConnection/documents/newprojects

chmod u=rwx /home/LabConnection/documents/newprojects/project1
ls -l /home/LabConnection/documents/newprojects/project1
chmod 765 /home/LabConnection/documents/newprojects/project2
ls -l /home/LabConnection/documents/newprojects/project2 ```



su root
p@ssw0rd
visudo

press i to enter insert mode
Student1	ALL=(ALL) 	ALL

esc + :wq to exit

su Student1



sudo fdisk -l

p@ssw0rd
/dev/sda: 21.5GB
Sector size: 512 bytes

sudo fdisk /dev/sda

clear



sudo mkdir /mnt/cdrom

sudo mount -r -t iso9660 /dev/cdrom /mnt/cdrom

ls -l /mnt/cdrom

mount

sudo umount /dev/cdrom

mount

ls -l /mnt/cdrom



su -

Passw0rd

clear
cd ..

ls -l

clear

du -h --max-depth=1

clear

swapon -s

clear

mount



sudo parted /dev/sda u s p

Passw0rd + enter

sudo fdisk -l /dev/sda

clear

sudo fdisk -l /dev/sdb



sudo fdisk -l

clear

sudo gdisk /dev/sdb



clear

sudo fdisk -l

clear

sudo umount /dev/sdb2

sudo mkswap /dev/sdb2

sudo mkfs -t ext3 /dev/sdb2

clear

sudo lsblk -f



ifconfig 

cat /etc/sysconfig/network-scripts/ifcfg-eth0

ping 127.0.0.1

ctrl + c

ping 192.168.15.1

ctrl + c

ping 8.8.8.8



sudo ifconfig eth0 192.168.15.254 netmask 255.255.255.0

Passw0rd

ifconfig



cat /etc/hosts

sudo vi /etc/hosts

*password*

i then enter on last line

192.168.15.107 thiscomputer

ping thiscomputer

ctrl + c

cat /etc/resolv.conf



sudo vi /etc/hosts

i

192.168.15.107 tab thiscomputer

esc :wq

ping thiscomputer

ctrl + c

cat /etc/resolv.conf

ping thiscomputer



sudo route add -net 2.0.0.0 netmask 255.0.0.0 gw 192.168.15.150

route

sudo route del -net 2.0.0.0 netmask 255.0.0.0 gw 192.168.15.150

sudo yum install telnet-server

sudo vi /etc/xinetd.d/telnet

sudo service xinetd restart

sudo chkconfig sshd on

sudo /etc/init.d/sshd start

ssh root@localhost

 

cp .bash_history sample1
cp /etc/passwd sample2
ls -l sample*

compress -v sample1 sample2

zcat sample1.Z
uncompress -v sample1.Z sample2.Z
ls -l sample*
clear

ls -l sample*

zcat sample1.gz
gunzip -v sample1.gz sample2.gz
ls -l sample*

ls -l sample*
bzip2 -v sample1 sample2

bzcat sample1.bz2
bzunip2 -v sample1.bz2 sample2.bz2




sudo vi /etc/dhcp/dhcpd.conf
i
default-lease-time 36000;
option routers 192.168.15.254;
option domain-name-servers 192.168.15.200;
subnet 192.168.15.0 netmask 255.255.255.0 {
range 192.168.15.1 192.168.15.100;
}
:wq
service dhcpd start
clear



ftp localhost 
anonymous 
ls
bye