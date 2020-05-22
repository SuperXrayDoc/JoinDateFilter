# Join Date Filter
**Created by Xray_Doc**

This mod was mostly made as a way for me to learn Java as I'm mostly a Python and C programmer. Expect the programming to look like amateur garbage.

# Installation
Have forge installed
Place JoinDateFilter.jar into your .minecraft/mods folder
Run the forge installation

# Config
To adjust the cut-off date go into your mods button in-game and find Join Date Filter. Click config and edit the values to your desired parameters.

Whitelist names are stored in .minecraft/JoinDateFilter/whitelist.txt
Add whitelist names to this text file for their messages to ignore your join date filter.

Dates and names of people logged are stored within .minecraft/JoinDateFilter/dates.txt

# IMPORTANT
Messages will always show up at least once if the person hasn't been logged yet since it takes time to get join date info from the server. After that they will be filtered.

# Changelog
**v 1.0.4:**

Fixed a weird error message that kept getting logged

Cleaned up the ip check for constantiam.net

No longer filters whispers and party chat

Added MIT license

**v1.0.3**

Fixed a bug that allowed players to bypass the filter by having [server] in their message

No longer filters your own messages if you set the cut-off date to before your joindate

Made it so the mod only works on constantiam.net

**v1.0.2**

Fixed to now work with OSX and Linux.

**v1.0.1**

Fixed issue where it would hide messages from [server].

**v1.0.0**

Release
