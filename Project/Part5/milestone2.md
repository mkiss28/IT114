<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Michael Kiss (mbk28)</td></tr>
<tr><td> <em>Generated: </em> 4/18/2023 4:21:36 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone-2/grade/mbk28" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/232877636-fb71afe9-a533-4f32-8055-6fe29fc95919.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Payload code 1<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/232877632-4e7bcf28-2ca2-42be-892c-4231ef7f79cb.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Payload Code 2<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/232882071-919fc8c0-fc0a-4cee-86b6-b6d7ed3c608d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Roll<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/232884789-c081f428-f57f-40a4-ab6b-35c45a5e96ab.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Flip<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <div>Roll : method of the Random class is called with the "number" parameter,<br>which specifies the upper bound of the range of random numbers to generate.<br>The result of this method is assigned to the "num" variable. Method "message"<br>is then sent with sender name and result.&nbsp;</div><div><br></div><div><br></div><div>Flip :&nbsp;</div><div>It creates a new random<br>number generator &nbsp;It checks whether the value of "face" is equal to 0.<br>If it is, then it sets the value of "HoT" to "Heads!". If<br>it is not, then it sets the value of "HoT" to "Tails!". Than<br>returns the value of HoT&nbsp;</div><div><br></div><div><br></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling via markdown or special characters</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/232881772-b2622b58-e290-425f-9db2-d3ccc8f875f8.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98507798/232894593-f18dafeb-0530-46d5-82ff-855c2b17195c.png first "if" statement checks if the "message" variable contains two consecutive asterisks (**). This code uses the "replaceAll()" method to replace all  that appear after a word boundary ("\b") with an opening "<b>". this code replaces double ** with HTML bold tags."/></td></tr>
<tr><td> <em>Caption:</em> <p>Results <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <p>first &quot;if&quot; statement checks if the &quot;message&quot; variable contains two consecutive asterisks (**).<br>This code uses the &quot;replaceAll()&quot; method to replace all &nbsp;that appear after a<br>word boundary (&quot;\b&quot;) with an opening &quot;&lt;b&gt;&quot;. this code replaces double ** with<br>HTML bold tags.<div><br></div><div>each one works the same way, but &quot;&lt;u&gt;&quot; for underline and<br>&quot;&lt;i&gt;&quot; for italic<br></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/mkiss28/IT114-008/pull/7">https://github.com/mkiss28/IT114-008/pull/7</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone-2/grade/mbk28" target="_blank">Grading</a></td></tr></table>