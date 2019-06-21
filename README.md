# Overview
Programming challenge on creating a simple app that displays actors from the movie database.

<img src="./screenshot.png">

# Description
Create a single screen app that allows a user to search for an actor and display the results.

Use The Movie Database API and the following the endpoint: /search/person

The user will be able to enter their search query and, upon enter, the app will call the endpoint and collect the results to display. The app must display all entities in the list and it must be sorted in descending order by `vote_average` (9.0, 8.7, 8.5, etc). The `vote_average` for a Person entity is a calculated value. The calculation is the average `vote_average` of all entities in the `known_for` array.

The layout for displaying a person will contain the following data: `profile_path` (image), `name`, list of `original_title` and `vote_average` in `known_for`, and the calculated value for `vote_average` (average of all `vote_average` in `known_for`).

### UI
Matching the exact design is not important; however the layout should be the same.

### API Key
`c352da303cecea898250194bd5cc0dc5`

### Documentation
[Search People](https://developers.themoviedb.org/3/search/search-people)
[Images](https://developers.themoviedb.org/3/getting-started/images)
`https://image.tmdb.org/t/p/original/{image}`

# Feature Priority
- Search for entities against API
- Display entities

# Bonus points
- Unit tests
- Pagination

# Submission
Once complete, submit a pull request against this repo.
