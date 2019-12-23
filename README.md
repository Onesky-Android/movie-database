# Overview
Programming challenge to create an Android app that allows a user to search and display movies from The Movie DB.

<img src="./Screenshot.png">

# Description
Create a single screen app that allows a user to search for movies and display the results in a list.

Use the following the endpoint from The Movie Database API: /search/movie

The user will be able to enter their search query and, upon enter, the app will call the endpoint and collect the results to display. The app should display all entities in the list and be sorted in descending order of `vote_average` (9.0, 8.7, 8.5, etc).

The layout for displaying a movie should contain the following data: `backdrop_path` (image), `title`, `release_date`, and `vote_average`.

### UI
Matching the exact design is not important; however the layout should be similar to the provided screenshot.

### API Key
`c352da303cecea898250194bd5cc0dc5`

### Documentation
[Search Movies](https://developers.themoviedb.org/3/search/search-movies)
[Images](https://developers.themoviedb.org/3/getting-started/images)
`https://image.tmdb.org/t/p/original/{image}`

# Feature Priority
- Search for entities against API
- Display of entities in list
- Overall Design
- Ability to favorite entities

# Submission
Once complete, submit a pull request against this repo.
