<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
      <div class="container-fluid">
        <form action="/postAnswer" method="post">
          <div class="form-group">
            <label for="exampleInputEmail1">Qual sua linguagem de programação preferida?</label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="language" id="exampleRadios1" value="java">
            <label class="form-check-label" for="exampleRadios1">
              Java
            </label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="language" id="exampleRadios2" value="python">
            <label class="form-check-label" for="exampleRadios2">
              Python
            </label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="language" id="exampleRadios3" value="c#">
            <label class="form-check-label" for="exampleRadios3">
              C#
            </label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="language" id="exampleRadios4" value="cobol">
            <label class="form-check-label" for="exampleRadios4">
              Cobol
            </label>
          </div>
          <button type="submit" class="btn btn-primary">Submit</button>
        </form>
      </div>


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  </body>
</html>