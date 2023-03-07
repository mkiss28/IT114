<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Michael Kiss (mbk28)</td></tr>
<tr><td> <em>Generated: </em> 3/6/2023 10:37:16 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-milestone1/grade/mbk28" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><ol><li>You will be updating this folder with new code as you do milestones</li><li>You won't be creating separate folders for milestones; milestones are just branches</li></ol><li>Create a milestone1.md file inside the Project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5 (clients should be having names at this point and not ids)</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/223304545-ad73b8e0-c3ff-4f0d-9507-489d54685d7b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server should properly be listening to its port from the command line<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/223304115-9ab3f73d-3c0e-4525-a21f-c6d4eee15127.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client should successfully be waiting for input<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/223304245-e2ff0fcd-f257-49a9-acd0-d995de94e885.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Show a screenshot of the client connecting to the server successfully<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p><span style="font-size: 13px;">1. Mention how the server-side of the connection works</span><div><span style="font-size: 13px;">The<br>server now is just a rooms manager, that doesn&#39;t block the connection and<br>takes in the port number. Then it passes arguement/commands to the room file<br>and it&#39;s helper functions for behavior.&nbsp;</span></div><div><span style="font-size: 13px;"><br></span></div><div><span style="font-size: 13px;">2. Mention how the<br>client-side of the connection works</span><span style="font-size: 13px;"><br></span></div><div><span style="font-size: 13px;">The client creates a socket<br>to the server on port 3000. It takes the IP address and port<br>number through input to initiate the connection, and creates an input stream wrapped<br>with a buffered reader to send responses to the server.&nbsp;</span></div><div><span style="font-size: 13px;"><br></span></div><div><span style="font-size:<br>13px;">3. Describe the socket steps until the server is waiting for messages from<br>the client</span><span style="font-size: 13px;"><br></span></div><div>Create a socket on the port, the socket gets accepted<br>by the server, obtains a printstream, then obtain an inputstream</div><div><br></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/223307070-20398f58-bc75-4881-9cf8-0010a8d4ae59.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>2 clients connected <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/223307172-bb2e8fc4-d4ff-4c06-bba3-f625a6762320.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client can send messages to the server  &amp; Server broadcasts the message<br>to all clients in the same room &amp; Messages clearly show who the<br>message is from (some client identifier)<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/223307997-2e32cd54-03d6-46bb-ada5-ce2dff282045.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Demonstrate clients in two different rooms can&#39;t send/receive messages to each other (clearly<br>show the clients are in different rooms)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <p>The client sends messages to the server it is connected to. All users<br>are put in a default room, and additional rooms are created. The helper<br>methods define what is done. Broadcast sends messages to all rooms, but by<br>default, messages are sent to users in that room. The helper methods on<br>the client receive the payload &quot;message&quot;, which calls other helper functions to get<br>the client&#39;s name and messages if he meets certain case conditions.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/223310142-4e2ced1f-43d3-43d1-8a17-e00ee90035ef.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>bottom terminal client disconnected <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/223310612-183d13d3-cc92-4523-9cbf-ac057a552c1c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Terminating server with two clients connected <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p><span style="font-size: 13px;">1. Mention how a client gets disconnected from a Socket perspective</span><div>&lt;span<br>style=&quot;font-size: 13px;&quot;&gt;socket gets closed</span><span style="font-size: 13px;"><br></span></div><div><span style="font-size: 13px;"><br></span><div><span style="font-size: 13px;"><br></span></div><div><span style="font-size: 13px;">2. Mention<br>how the client program doesn&#39;t crash when the server discon</span><span style="font-size: 13px;">nects/terminates.</span></div><div><span style="font-size:<br>13px;">The socket gets closed, and the client keeps running its local code.&nbsp;</span><br></div><div><span style="font-size:<br>13px;"><br></span></div><div><span style="font-size: 13px;"><br></span></div><div><span style="font-size: 13px;">3.&nbsp;</span><span style="font-size: 13px;">Mention how the server doesn&#39;t crash from<br>the client(s) disconnecting</span></div><div><span style="font-size: 13px;">That socket just closes. There can be many more<br>and other sockets aren&#39;t affected, so things keep working.&nbsp;</span><span style="font-size: 13px;"><br></span></div></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/mkiss28/IT114-008/pull/6">https://github.com/mkiss28/IT114-008/pull/6</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Talk about any issues or learnings during this assignment</td></tr>
<tr><td> <em>Response:</em> <p>Sockets are how two separate devices connect running separate JVMs. Not sure what<br>else to say other than I hope to never use JVM or java<br>ever again after this.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-milestone1/grade/mbk28" target="_blank">Grading</a></td></tr></table>