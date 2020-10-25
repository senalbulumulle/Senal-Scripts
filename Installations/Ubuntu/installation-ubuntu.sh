##  Installation Script for Ubuntu
##  Written by Senal Bulumulle
##  This Script allows the system to install some of the applications and dependencies that are used for coding.

## Using APT Package Manager, Install Some Dependencies and Applications that are used for the Ubuntu Server

## Make Sure System needs updates
sudo apt upgrade

## Install 'git' dependency
sudo apt install git

## Install 'firefox' dependency
sudo apt install firefox

## Install 'apache2' and 'php'
sudo apt install apache2 php 

## Install 'node.js' dependency
sudo apt install nodejs

## Install 'gnome-desktop-environment' dependency
sudo apt install gnome-session

## Install 'lightdm' dependency for login
sudo apt install lightdm

## Uncomment the 'ubuntu-desktop' dependency if wanted UI (Yaru Theme for Gnome Desktop Environment)
## sudo apt install ubuntu-desktop

## Install 'gdebi' GUI Package Manager Application for install Debian Packages
sudo apt install gdebi

## Install 'dpkg' to install packages without graphical interface
sudo apt install dpkg

## Install 'wget' to install packages without graphical interface
sudo apt install wget

## Install Google Chrome using wget
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb

## Using wget, install github desktop for ubuntu 
wget https://github.com/shiftkey/desktop/releases/download/release-2.5.3-linux1/GitHubDesktop-linux-2.5.3-linux1.deb

## Do the thing 
sudo apt remove ubuntu-desktop
sudo apt remove gnome-session
sudo apt remove gnome-shell
sudo apt remove gdm
sudo apt install gnome-session


## Install Apps 
sudo apt install nautilus

sudo update-alternatives --config gdm3.css
## Prompt user that Script is ended 
echo "######################################################"
echo "                Script has ended                      "
echo "	       	     Please Restart Your System             " 
echo "######################################################"


