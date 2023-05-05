<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Michael Kiss (mbk28)</td></tr>
<tr><td> <em>Generated: </em> 5/5/2023 6:16:09 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone4/grade/mbk28" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/236575774-70d67a60-d672-4bec-956b-fed6ab6d44ed.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Export button<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/236575215-b0c0b1a2-9ad6-4b34-a8c9-c74162c60244.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>chat_history.txt<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>String list was created called chat history. This is contantly storing the inputs<br>from users. and then exports to a file with the same name. Uses<br>a function that uses a basic file writer to export the list to<br>that txt file.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707834-bf5a5b13-ec36-4597-9741-aa830c195be2.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> <p>I wasn&#39;t able to actaully get this working<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> <p>Blank<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I wasn&#39;t able to actually get this working, I tried a similar approach<br>to the filewriter export method, but the issue was surrounding actually storing the<br>mute list and reading off of it.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/236575206-88fd330d-2642-490b-9f26-76929871d636.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Mute demo <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/236575212-6daf07e9-b1d8-48ae-80d8-b78b79be2246.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>Added a function similar to roll, that looked for the phrase /mute would<br>call the mute and unmute fuction and asned a message with the client<br>that called it and the texted &quot;has muted you: at the end<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/236575206-88fd330d-2642-490b-9f26-76929871d636.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Two users are muted, the chat explains who. Grey means muted<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/236575208-0b46ddee-94ac-4fb2-ac27-68ad73892ac2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Yellow is the last user who sent a message. <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/236575211-5f24837f-fe74-44bc-86e8-c880f14ac9f3.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>2nd example<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>If the user types /mute, I change the background color to gray. This<br>is removed if the unmute. I use repaint() to reset the background. For<br>highlighting the last user to send a message, I change the background color<br>to yellow. Then, when the next user types a message, I reset the<br>previous user&#39;s background color.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone4/grade/mbk28" target="_blank">Grading</a></td></tr></table>