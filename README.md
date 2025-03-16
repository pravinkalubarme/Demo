Full flow in one go:
git init
git add .
git commit -m "Your commit message"
===========================================================
git config --global user.email "pravinpkalubarme@gmail.com"
git config --global user-name "pravinkalubarme"
===========================================================
git remote add origin https://github.com/yourusername/repository-name.git
git checkout -b SP-112
git push -u origin SP-112 (Branch name)
This should successfully push your code to the GitHub repository.


Check the existing remotes:
You can check the currently configured remotes by running:

>> git remote -v  
This will show you the list of existing remotes. 
If origin already points to another URL, you may want to either update it or remove it.

2. Change the URL for the existing remote origin:
If you want to change the URL of the existing remote origin, use the following command:
>> git remote set-url origin https://github.com/pravinkalubarme/Demo.git
This will update the URL of the existing remote origin to the new one.

3. Remove the existing remote and add a new one:
If you want to completely remove the existing remote and add a new one, you can use these commands:
>> git remote remove origin
>> git remote add origin https://github.com/pravinkalubarme/Demo.git

4. Verify the change:
After making the change, verify the new remote URL:
>> git remote -v
This should resolve the error and allow you to push or pull from the correct repository.

Commands step by step:
1. Initialize your Git repository (if you haven't already):
git init
This initializes a new Git repository in your local directory.

2. Check the status of your files (optional, but helpful):
git status
This will show you which files are untracked or modified.

3. Add all files to the staging area:
git add .
This stages all changes, including new, modified, or deleted files.

Alternatively, you can add specific files:
git add <file_name>

4. Commit the changes:
git commit -m "Your commit message here"
This commits the changes with a message describing what has been modified or added.

5. Set up the remote repository (if you haven't already):
If you don't have a remote configured, use:
git remote add origin https://github.com/yourusername/repository-name.git
Replace yourusername and repository-name with your GitHub username and the name of your repository.

If the remote already exists and you need to change the URL, use:
git remote set-url origin https://github.com/yourusername/repository-name.git

6. Push your changes to GitHub (main branch or other branch):
If you're pushing to the main branch, use:
git push -u origin main
If you're pushing to a different branch, replace main with the branch name:
git push -u origin <branch-name>
Note: The -u flag sets the upstream for the branch, meaning you don't have to specify origin and <branch-name> on subsequent pushes.

7. Verify your code is pushed:
Go to your GitHub repository page and check if the code appears there.
