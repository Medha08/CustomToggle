
An Example how to create a Custom toggle

Step 1 : Add the Two icons image asset from res/drawable folder of Toggle off and on stored in mipmap . 
Step 2 : Create an xml file toggle_selector.xml in drawable fole where map the status of toggle with the toggle image 
                  for itemp drawable toggle on -> android:state_checked="true"
                  for itemp drawable toggle off -> android:state_checked="false"
Step 3: In activity main.xml 
           Add toggle Button and define background of toggle with toggle_selector.xml
           Put textOn="" and textOff="" to prevent any unnecessary text
Step 4: Add the toggle button in Main Activity and  toggle Listeners 

    Refer only following folders and files  
          drawable 
          MainActivity.java 
          mipmap
          activity_main.xml 
          
Done !
