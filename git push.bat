git status
git add ./

set /p userInput=Enter a commit message : 
git commit -m "%userInput%"
pause
git push -u origin main
pause