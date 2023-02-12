<table><tr><td> <em>Assignment: </em> IT114 - Number Guesser</td></tr>
<tr><td> <em>Student: </em> Michael Kiss (mbk28)</td></tr>
<tr><td> <em>Generated: </em> 2/12/2023 6:45:59 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-number-guesser/grade/mbk28" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create the below branch name</li><li>Implement the NumberGuess4 example from the lesson/slides</li><li>Add/commit the files as-is from the lesson material (this is the base template)</li><li>Pick two (2) of the following options to implement</li><ol><li>Display higher or lower as a hint after a wrong guess</li><li>Implement anti-data tampering of the save file data (reject user direct edits)</li><li>Add a difficulty selector that adjusts the max strikes per level</li><li>Display a cold, warm, hot indicator based on how close to the correct value the guess is (example, 10 numbers away is cold, 5 numbers away is warm, 2 numbers away is hot; adjust these per your preference)</li><li>Add a hint command that can be used once per level and only after 2 strikes have been used that reduces the range around the correct number (i.e., number is 5 and range is initially 1-15, new range could be 3-8 as a hint)</li><li>Implement separate save files based on a "What's your name?" prompt at the start of the game</li></ol><li>Fill in the below deliverables</li><li>Create an m3_submission.md file and fill in the markdown from this tool when you're done</li><li>Git add/commit/push your changes to the HW branch</li><li>Create a pull request to main</li><li>Complete the pull request</li><li>Grab the link to the m3_submission.md from the main branch and submit that direct link to github</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Implementation 1 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/218343961-4d01293c-8314-43d7-8b11-88d1d414a391.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Display higher or lower as a hint for wrong guesses <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/218343995-7934ddb1-a592-43c5-9c2e-f59661ddd08a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Source code <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>If statement added, if the users guess is lower than the number it<br>returns a print statement. Else if added after to check if the opposite<br>is true<div><br></div><div><br></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Implementation 2 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/218344164-9fa3e40a-345e-40f3-9723-a46d6052c4d2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Add a hint command that can be used once per level<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/218344184-83c0ee9b-5e42-4d31-9c29-9ddda8826cd1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>source code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>initializes the variable hints used outside the if statement. This variable resets each<br>level.<div><br></div><div>It checks to see that they user hasn&#39;t used a hint this level,<br>and checks to see that they have used at least 2 strikes. Once<br>these conditions are met, it prints to the screen that the number is<br>between the number divided by 2 and half the number minus the top<br>range of the level.&nbsp;</div><div><br></div><div>I did it this way instead of just adding and<br>subtracting to the number because it would look weird if If it was<br>showing that the number was between a number that was outside of the<br>range.&nbsp;</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a link to the related pull request of this hw</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/mkiss28/IT114-008/pull/4">https://github.com/mkiss28/IT114-008/pull/4</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Discuss anything you learned during this lesson/hw or any struggles you had</td></tr>
<tr><td> <em>Response:</em> <p>I found it kind of annoying that I couldn&#39;t use the int range<br>because it was defined in the do statement. So to reuse that number<br>I had to copy all the math used to get to that figure.<br>I tried moving it, but didn&#39;t want to change the program too much.&nbsp;<div><br></div><div><br></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-number-guesser/grade/mbk28" target="_blank">Grading</a></td></tr></table>