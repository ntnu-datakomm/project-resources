# Project resources

Resources that can be handy for projects
in [IDATA2304 Computer Networks](https://www.ntnu.edu/studies/courses/IDATA2304).

# Raspberry Pi

If you want to run software on your own server, Raspberry Pi is a good platform for that purpose, because:

- It does not require a lot of energy, therefore you can keep it operating all the time
- It does not produce noise or heat
- It is relatively cheap
- It runs the Linux operating system (OS) which is more developer friendly - there are many resources, scripts,
  libraries and tools available which can be run from the command line, combined etc.)

Raspberry Pi stores the operating system and other files on an SD card. It typically comes preinstalled with an OS, but
you may want to install an updated version of OS on it.

Here are some resources for the Raspberry Pi:

- We have [Raspberry Pi 3 Model A+](https://www.raspberrypi.com/products/raspberry-pi-3-model-a-plus/) in the Lab.
- When you get a RasPi from the lab, take a USB hub also - there is only one USB port on the RasPi. There are USB hubs
  in the lab (should be in the same box with RasPis).
- [Installing the OS on an SD from image-files](https://www.raspberrypi.com/documentation/computers/getting-started.html#installing-the-operating-system)
  . The suggested way is to use [Raspberry Pi Imager](https://www.raspberrypi.com/software/).
    - Choose "Raspberry Pi OS LITE (32-Bit)" image
    - Under the settings (gear icon) select:
        - Enable SSH
        - Set a password for the pi user
        - Write in the SSID and password for your Wi-Fi access point. In case you forgot to do that, check out
          this [article on setting up Wi-Fi](https://www.seeedstudio.com/blog/2021/01/25/three-methods-to-configure-raspberry-pi-wifi/)
          .
- Raspberry Pi has General-Purpose Input/Output (GPIO) pins available on the board. You can connect LEDs, sensors,
  buttons and other devices to it. Read about the GPIO pins and their use
  in [the official docs](https://www.raspberrypi.com/documentation/computers/os.html#gpio-and-the-40-pin-header).
- If you want to access the GPIO on RasPi using Java program, check out the [Pi4J library](https://pi4j.com/about/).
- To launch a program on startup, check
  out [this article](https://people.utm.my/shaharil/run-programs-on-your-raspberry-pi-at-startup/) which mentions two
  methods.
- On a RasPi you may want to do many things on the command line. In general, RasPi gives you access to the powerful
  command line of Unix. Here is a
  good [Cheat-sheet for the command line](https://www.makeuseof.com/tag/raspberry-pi-commands-cheat-sheet/) (and some
  other stuff).
- The graphical interface can be quite slow, it won't be practical for many purposes. The Lite version of OS comes with
  no graphical interface, just command line. If you installed the regular version with GUI and now want to remove the
  GUI (and all dependent packages), execute the following commands on the command line:

```
    sudo apt-get --purge remove "x11-*"
    sudo apt-get --purge autoremove
```

Just make sure you will be able to access the device on the command line:

- The default username is `pi` if you have not changed it
- The default password is empty
- If you want to access the RasPi remotely, you can do it using SSH protocol (you need an SSH client for it). Read
  more about it [here](https://raspberrypi-guide.github.io/networking/connecting-via-ssh).
    - To find out the IP address of the RasPi (assuming you have connected it to Wi-Fi), in the terminal
      type `hostname -I`.
    - If you are on a Windows machine, you can install [Putty - an SSH client](https://www.putty.org/).

While you can install Java and Python (Python is preinstalled) on a Raspberry Pi, it is not powerful enough to run
IntelliJ or other fancy editors. Therefore, you can edit Java files on your local machine and set up an SSH tunnel to
the RasPi - every time you save the files (Ctrl + S), these can be automatically uploaded to the RasPi over SSH.
Check out videos Nr 09.3.18 and 09.3.19 in the Deployment video series (on Blackboard). These explain how to set up file
copy from IntelliJ (or PyCharm, or WebStorm) to a server (which is Raspberry Pi in this case). 