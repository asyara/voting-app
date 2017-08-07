import React from 'react'

export default class App extends React.Component {
    render() {
        return (
            <div class="site-wrapper">
                <div class="site-wrapper-inner">
                    <div class="cover-container container">
                        <div class="row">
                            <div class="inner cover col-xs-12">
                                <h1 class="cover-heading">Welcome to "Voter" - service for creating surveys</h1>
                                <p class="lead">other text</p>
                            </div>
                        </div>

                       <div class="container">
                       { this.props.children }
                       </div>

                        <div class="mastfoot">
                            <div class="inner">
                                <p>Cover template for
                                    <a href="https://getbootstrap.com">Bootstrap</a>, by
                                    <a href="https://twitter.com/mdo">@mdo</a>.
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}