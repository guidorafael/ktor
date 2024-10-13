This is a README.md from ktor fiolder!
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git remote -v
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git remote -v
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   README.md
	new file:   main.kt

ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git config
usage: git config [<options>]

Config file location
    --[no-]global         use global config file
    --[no-]system         use system config file
    --[no-]local          use repository config file
    --[no-]worktree       use per-worktree config file
    -f, --[no-]file <file>
                          use given config file
    --[no-]blob <blob-id> read config from given blob object

Action
    --[no-]get            get value: name [value-pattern]
    --[no-]get-all        get all values: key [value-pattern]
    --[no-]get-regexp     get values for regexp: name-regex [value-pattern]
    --[no-]get-urlmatch   get value specific for the URL: section[.var] URL
    --[no-]replace-all    replace all matching variables: name value [value-pattern]
    --[no-]add            add a new variable: name value
    --[no-]unset          remove a variable: name [value-pattern]
    --[no-]unset-all      remove all matches: name [value-pattern]
    --[no-]rename-section rename section: old-name new-name
    --[no-]remove-section remove a section: name
    -l, --[no-]list       list all
    --[no-]fixed-value    use string equality when comparing values to 'value-pattern'
    -e, --[no-]edit       open an editor
    --[no-]get-color      find the color configured: slot [default]
    --[no-]get-colorbool  find the color setting: slot [stdout-is-tty]

Type
    -t, --[no-]type <type>
                          value is given this type
    --bool                value is "true" or "false"
    --int                 value is decimal number
    --bool-or-int         value is --bool or --int
    --bool-or-str         value is --bool or string
    --path                value is a path (file or directory name)
    --expiry-date         value is an expiry date

Other
    -z, --[no-]null       terminate values with NUL byte
    --[no-]name-only      show variable names only
    --[no-]includes       respect include directives on lookup
    --[no-]show-origin    show origin of config (file, standard input, blob, command line)
    --[no-]show-scope     show scope of config (worktree, local, global, system, command)
    --[no-]default <value>
                          with --get, use default value when missing entry

ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git config -l
user.email=guidorafael23@gmail.com
user.name=guidorafael
init.defaultbranch=master
credential.helper=store
core.autocrlf=input
core.repositoryformatversion=0
core.filemode=true
core.bare=false
core.logallrefupdates=true
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ 
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git remote add origin git@github.com:guidorafael/ktor.git
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git config -l
user.email=guidorafael23@gmail.com
user.name=guidorafael
init.defaultbranch=master
credential.helper=store
core.autocrlf=input
core.repositoryformatversion=0
core.filemode=true
core.bare=false
core.logallrefupdates=true
remote.origin.url=git@github.com:guidorafael/ktor.git
remote.origin.fetch=+refs/heads/*:refs/remotes/origin/*
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   README.md
	new file:   main.kt

ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git push -u origin main
error: src refspec main does not match any
error: failed to push some refs to 'github.com:guidorafael/ktor.git'
    
    ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git branch
nada respondeu 
    ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git checkout -b main

Switched to a new branch 'main'
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git add .
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ ^M
: command not found
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git commit -m "Initial commit"
[main (root-commit) 36ad28e] Initial commit
 2 files changed, 4 insertions(+)
 create mode 100644 README.md
 create mode 100644 main.kt
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git push -u origin main
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (4/4), 325 bytes | 325.00 KiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
To github.com:guidorafael/ktor.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ 

     passou a funcionar quando deu git checkout -b main na pasta root do projeto 
     ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ git remote -v
origin	git@github.com:guidorafael/ktor.git (fetch)
origin	git@github.com:guidorafael/ktor.git (push)
ssdm2@ssdm2-X99-F8:~/kotlin/hyperskill_introd_ktor/ktor_initial/ktor$ 

